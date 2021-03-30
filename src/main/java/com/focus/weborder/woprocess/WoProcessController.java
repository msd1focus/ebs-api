package com.focus.weborder.woprocess;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.focus.weborder.woprocess.model.OrderDetailInfo;
import com.focus.weborder.woprocess.model.OrderDetailNonWo;
import com.focus.weborder.woprocess.model.OrderHdrNonWo;
import com.focus.weborder.woprocess.repository.OrderDetailInfoRepository;

@RestController
@RequestMapping("/rest")
public class WoProcessController {

	@Autowired
	private OrderDetailInfoRepository orderDtlRepo;
	@Autowired
	private OrderDetailInfoService orderDtlService;
	@Autowired
	private OrderNonWoService orderNonWoService;
	
	@RequestMapping("/orderinfo")
	public List<OrderDetailInfo> getOrderInfo(@RequestParam String orderid) {
		return orderDtlService.getByOrderId(orderid);
	}

	@RequestMapping("/orderinfobypo")
	public List<OrderDetailInfo> getOrderInfoByPo(@RequestParam String poNo) {
		return orderDtlRepo.findByCustPoNoOrderByCoNo(poNo);
	}

	@RequestMapping("/ordersummarynonwo")
	public List<OrderHdrNonWo> getOrderSummaryNonWo(@RequestParam String pCustId,
														@RequestParam String pDate1, 
														@RequestParam String pDate2) {
		
		Integer custId = Integer.valueOf(pCustId);
		Date date1 = new Date();
		Date date2 = new Date();
		try {
			date1 = new SimpleDateFormat("yyyy-MM-dd").parse(pDate1);  
			date2 = new SimpleDateFormat("yyyy-MM-dd").parse(pDate2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		List<OrderHdrNonWo> ordersNonWO = orderNonWoService.getOrderNonWo(custId, date1, date2);
		
		return ordersNonWO;
	}

	@RequestMapping("/orderdetailnonwo")
	public List<OrderDetailNonWo> getOrderDetailNonWo (@RequestParam String pCustId,
														@RequestParam String noPo) {
		Integer custId = Integer.valueOf(pCustId);

		List<OrderDetailNonWo> orders = new ArrayList<>();
		orders = orderNonWoService.getOrderDetailNonWo(custId, noPo);
		return orders ;
	}
}
