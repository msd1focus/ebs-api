package com.focus.weborder.woprocess;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class OrderDetailInfoController {

	@Autowired
	private OrderDetailInfoRepository orderDtlRepo;
	@Autowired
	private OrderDetailInfoService orderDtlService;
	
	@RequestMapping("/orderinfo")
	public List<OrderDetailInfo> getOrderInfo(@RequestParam String orderid) {
		return orderDtlService.getByOrderId(orderid);
	}

	@RequestMapping("/orderinfobypo")
	public List<OrderDetailInfo> getOrderInfoByPo(@RequestParam String poNo) {
		return orderDtlRepo.findByCustPoNo(poNo);
	}

}
