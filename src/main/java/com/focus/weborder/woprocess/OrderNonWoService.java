package com.focus.weborder.woprocess;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.focus.weborder.woprocess.model.InvoicePo;
import com.focus.weborder.woprocess.model.OrderDetailNonWo;
import com.focus.weborder.woprocess.model.OrderHdrNonWo;
import com.focus.weborder.woprocess.repository.InvoicePoRepo;
import com.focus.weborder.woprocess.repository.OrderDetailNonWoRepo;
import com.focus.weborder.woprocess.repository.OrderHdrNonWoRepo;

@Service
public class OrderNonWoService {

	@Autowired
	private OrderHdrNonWoRepo orderSumNonWoRepo;
	@Autowired
	private InvoicePoRepo invoicePoRepo;
	@Autowired
	private OrderDetailNonWoRepo orderDetailNonWoRepo;
	
	public List<OrderHdrNonWo> getOrderNonWo (Integer custId,
												Date date1, Date date2) {
		List<OrderHdrNonWo> orderHdrNonWoList = new ArrayList<>();
		orderHdrNonWoList = orderSumNonWoRepo.findByCustomerIdAndTglPoBetween(custId, date1, date2);
		System.out.println("Jumlah: " + orderHdrNonWoList.size());
		while(orderHdrNonWoList.remove(null));
		
		for (OrderHdrNonWo orderHdr : orderHdrNonWoList) {
			
			System.out.println(orderHdr.getTglPo());
			
			List<InvoicePo> invoicePos = invoicePoRepo.findByCustPoNumberAndCustId(
																	orderHdr.getCustPoNo(),
																	orderHdr.getCustomerId());
			List<String> invoices = new ArrayList<>();
			for (InvoicePo invoicePo : invoicePos) { 
				invoices.add(invoicePo.getInvoiceNumber());
			}
			orderHdr.setInvoices(invoices);
		}
		return orderHdrNonWoList;

	}

	public List<OrderDetailNonWo> getOrderDetailNonWo (Integer custId, String noPo) {
		List<OrderDetailNonWo> orders = orderDetailNonWoRepo.findByCustIdAndNoPoOrderByCoNo(custId, noPo);
		return orders;
	}
}
