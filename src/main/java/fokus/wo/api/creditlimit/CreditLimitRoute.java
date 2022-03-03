package fokus.wo.api.creditlimit;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreditLimitRoute extends RouteBuilder{
	@Autowired private CreditLimitService creditLimitService;
	
	@Override
	public void configure() throws Exception {

		JacksonDataFormat creditlimitListJDF = new JacksonDataFormat(CreditLimitList.class);

		from("direct:creditlimits")
			.process(new Processor() {
				public void process(Exchange exchange) throws Exception {
					CreditLimitList creditLimitList = new CreditLimitList();
					creditLimitList.setCreditLimits(creditLimitService.getAll());
					exchange.getMessage().setBody(creditLimitList);
				}
			})
			.marshal(creditlimitListJDF)
			;

		from("direct:creditlimit")
			.process(new Processor() {
				public void process(Exchange exchange) throws Exception {
					Long custid = exchange.getMessage().getHeader("custid", Long.class);
					CreditLimitList creditLimitList = new CreditLimitList();
					creditLimitList.setCreditLimits(creditLimitService.getByCust(custid));
					exchange.getMessage().setBody(creditLimitList);
				}
			})
			.marshal(creditlimitListJDF)
		;

	}

}
