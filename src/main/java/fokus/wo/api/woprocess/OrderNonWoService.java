package fokus.wo.api.woprocess;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fokus.wo.api.woprocess.model.InvoicePo;
import fokus.wo.api.woprocess.model.OrderDetailNonWo;
import fokus.wo.api.woprocess.model.OrderHdrNonWo;
import fokus.wo.api.woprocess.repository.InvoicePoRepo;
import fokus.wo.api.woprocess.repository.OrderDetailNonWoRepo;
import fokus.wo.api.woprocess.repository.OrderHdrNonWoRepo;

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
		orderHdrNonWoList = orderSumNonWoRepo.findByCustomerIdAndTglPoBetweenOrderByCustPoNoDesc(custId, date1, date2);

		while(orderHdrNonWoList.remove(null));
		
		for (OrderHdrNonWo orderHdr : orderHdrNonWoList) {
			// collect data invoices
			List<InvoicePo> invoicePos = invoicePoRepo.findByCustPoNumberAndCustId(
																	orderHdr.getCustPoNo(),
																	orderHdr.getCustomerId());
			List<String> invoices = new ArrayList<>();
			for (InvoicePo invoicePo : invoicePos) { 
				invoices.add(invoicePo.getInvoiceNumber());
			}
			orderHdr.setInvoices(invoices);
			
			//collect data DO
			List<OrderDetailNonWo> orders = orderDetailNonWoRepo.findByNoPoOrderByCoNo(orderHdr.getCustPoNo());
			List<String> doNumbers = new ArrayList<>();
			for (OrderDetailNonWo order : orders) {
				doNumbers.add(order.getDoNo());
			}
			orderHdr.setListDONumber(doNumbers);
			
		}
		return orderHdrNonWoList;

	}

	public List<OrderDetailNonWo> getOrderDetailNonWo (Integer custId, String noPo) {
		List<OrderDetailNonWo> orders = orderDetailNonWoRepo.findByCustIdAndNoPoOrderByCoNo(custId, noPo);
		return orders;
	}
}
