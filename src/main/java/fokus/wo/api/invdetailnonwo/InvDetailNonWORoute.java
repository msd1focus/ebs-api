package fokus.wo.api.invdetailnonwo;

import java.sql.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InvDetailNonWORoute extends RouteBuilder {

	@Autowired
	private InvDetailNonWOService invDetailNonWOService;

	@Override
	public void configure() throws Exception {

		JacksonDataFormat invDetailNonWoJDF = new JacksonDataFormat(InvDetailNonWOList.class);

		from("direct:invdetailnonwos")
			.process(new Processor() {
				public void process(Exchange exchange) throws Exception {
					InvDetailNonWOList datalist = new InvDetailNonWOList();
					datalist.setInvDetailNonWOList(invDetailNonWOService.getAllInvDetails());
					exchange.getMessage().setBody(datalist);
				}
			})
			.marshal(invDetailNonWoJDF)
		;
		
		from("direct:direct:invdetailnonwotrxnumber")
			.process(new Processor() {
				public void process(Exchange exchange) throws Exception {
					String trxnumber = exchange.getMessage().getHeader("trxnumber", String.class);
					InvDetailNonWOList datalist = new InvDetailNonWOList();
					datalist.setInvDetailNonWOList(invDetailNonWOService.getByTrxNumber(trxnumber));
					exchange.getMessage().setBody(datalist);
				}
			})
			.marshal(invDetailNonWoJDF)
		;

		from("direct:invdetailnonwocustid")
			.process(new Processor() {
				public void process(Exchange exchange) throws Exception {
					Long custid = exchange.getMessage().getHeader("custid", Long.class);
					InvDetailNonWOList datalist = new InvDetailNonWOList();
					datalist.setInvDetailNonWOList(invDetailNonWOService.getByCustid(custid));
					exchange.getMessage().setBody(datalist);
				}
			})
			.marshal(invDetailNonWoJDF)
		;

		from("direct:invdetailnonwocustidstartenddate")
			.process(new Processor() {
				public void process(Exchange exchange) throws Exception {
					Long custid = exchange.getMessage().getHeader("custid", Long.class);
					Date startdate = exchange.getMessage().getHeader("startdate", Date.class);
					Date enddate = exchange.getMessage().getHeader("enddate", Date.class);
					InvDetailNonWOList datalist = new InvDetailNonWOList();
					datalist.setInvDetailNonWOList(invDetailNonWOService.getByCustidStartEnddate(custid, startdate, enddate));
					exchange.getMessage().setBody(datalist);
				}
			})
			.marshal(invDetailNonWoJDF)
		;

	}

}
