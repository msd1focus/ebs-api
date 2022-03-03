package fokus.wo.api.invdetail;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InvDetailRoute extends RouteBuilder{
	@Autowired
	private InvDetailService invDetailService;

	@Override
	public void configure() throws Exception {

		JacksonDataFormat invDtlListJDF = new JacksonDataFormat(InvDetailList.class);

		from ("direct:invdetails")
			.process(new Processor() {
				public void process(Exchange exchange) throws Exception {
					Iterable<InvDetail> invDetailList = invDetailService.getAllInvDetails();
					exchange.getMessage().setBody(invDetailList);
				}
			})
			.marshal(invDtlListJDF)
		;

		from ("direct:invdetail")
			.process(new Processor() {
				public void process(Exchange exchange) throws Exception {
					String trxNumber = exchange.getMessage().getHeader("trxnumber", String.class);
					List<InvDetail> invDetailList = invDetailService.getByTrxNumber(trxNumber);
					exchange.getMessage().setBody(invDetailList);
				}
			})
			.marshal(invDtlListJDF)
		;

		from ("direct:invdetailbycustid")
			.log("Mulai")
			.process(new Processor() {
				public void process(Exchange exchange) throws Exception {
					Long custId = exchange.getMessage().getHeader("customertrxid", Long.class);
					List<InvDetail> invDetailList = invDetailService.getByCustomertrxid(custId);
					exchange.getMessage().setBody(invDetailList);
				}
			})
			.marshal(invDtlListJDF)
		;
	
	}

}
