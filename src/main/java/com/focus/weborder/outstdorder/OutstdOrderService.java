package com.focus.weborder.outstdorder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OutstdOrderService {

	@Autowired
	private OutstdOrderRepo outstdOrderRepo;
	
	public List<OrderOutstdPojo> getOutstdAggr (String 		custCode,
												Date 	date1,
												Date 	date2,
												Long 		po1,
												Long 		po2) 
	{
		List<OrderOutstdPojo> fmv = new ArrayList<>();
		List<OrderAggrI> o = outstdOrderRepo.getAggrByCustAndDateAndPo(custCode, date1, date2, po1, po2);
		
		for (OrderAggrI order : o) {

			OrderOutstdPojo aggr = new OrderOutstdPojo();
			aggr.setItemCode(order.getItemCode());
			aggr.setItemName(order.getItemName());
			aggr.setUom(order.getUom());
			aggr.setOrderQtyOuts((Long)order.getOrderQtyOuts());
			aggr.setOrderValueOuts(order.getOrderValueOuts());
			aggr.setQuoteQtyOuts(order.getQuoteQtyOuts());
			aggr.setQuoteValueOuts(order.getQuoteValueOuts());
			aggr.setTotalQtyOuts(order.getOrderQtyOuts() + order.getQuoteQtyOuts());
			fmv.add(aggr);
		}
		return fmv;
	}
	
	public List<OrderOutstdPojo> getOutstdByItem (	String custCode, 
													String itemCode,
													Date 	date1,
													Date 	date2,
													Long 		po1,
													Long 		po2) 
	{
		List<OrderOutstdPojo> outs = new ArrayList<>();
		
		List<OrderDtlI> orders = outstdOrderRepo.getDetail(custCode, itemCode, date1, date2, po1, po2);
		for (OrderDtlI order:orders) {
			
//			System.out.println("CustPo: " + order.getCustPo());
//			System.out.println(order.getItemCode());
//			System.out.println(order.getItemName());
//			System.out.println(order.getOrderSource());
//			System.out.println(order.getUom());
//			System.out.println(order.getOrderQtyOuts());
//			System.out.println(order.getOrderValueOuts());
//			System.out.println(order.getQuoteQtyOuts());
//			System.out.println(order.getQuoteValueOuts());
//			
			OrderOutstdPojo o = new OrderOutstdPojo();
			o.setItemCode(order.getItemCode());
			o.setItemName(order.getItemName());
			o.setUom(order.getUom());
			o.setOrderQtyOuts((Long)order.getOrderQtyOuts());
			o.setOrderValueOuts(order.getOrderValueOuts());
			o.setQuoteQtyOuts(order.getQuoteQtyOuts());
			o.setQuoteValueOuts(order.getQuoteValueOuts());
			o.setTotalQtyOuts(order.getOrderQtyOuts() + order.getQuoteQtyOuts());

			if (order.getOrderSource().equals("Non Web Order")) o.setCustPo("Non Web Order");
			else o.setCustPo(order.getCustPo());

			outs.add(o);
		}
		return outs;
	}
}
