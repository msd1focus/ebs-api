package fokus.wo.api.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RestApiEndpoint extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		restConfiguration().component("servlet");

		rest("/rest")
			.get("/creditlimits")
				.consumes("application/json")
				.to("direct:creditlimits")
				
			.get("/creditlimit")
				.consumes("application/json")
				.to("direct:creditlimit")
			
			.get("/invdetails")
				.consumes("application/json")
				.to("direct:invdetails")

			.get("/invdetail")
				.consumes("application/json")
				.to("direct:invdetail")

			.get("/invdetail/customertrxid")
				.consumes("application/json")
				.to("direct:invdetailbycustid")

			.get("/invdetailnonwos")
				.consumes("application/json")
				.to("direct:invdetailnonwos")
				
			.get("/invdetailnonwo/trxnumber")
				.consumes("application/json")
				.to("direct:invdetailnonwotrxnumber")

			.get("/invdetailnonwo/custid")
				.consumes("application/json")
				.to("direct:invdetailnonwocustid")

			.get("/invdetailnonwo/custidstartenddate")
				.consumes("application/json")
				.to("direct:invdetailnonwocustidstartenddate")

				;
		
	}

	
}
