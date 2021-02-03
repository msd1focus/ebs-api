package com.focus.weborder.woprocess;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailInfoService {

	@Autowired
	private OrderDetailInfoRepository orderInfoRepo;
	
	public List<OrderDetailInfo> getByOrderId (String orderId) {
		List<OrderDetailInfo> orders = orderInfoRepo.findByOrderId(orderId);
		for (OrderDetailInfo order : orders) {
			order.setCoTgl(order.getCoTgl().substring(0, 10));
			if (!(null == order.getSoTgl())) 
				order.setSoTgl(order.getSoTgl().substring(0, 10));
			if (!(null == order.getDoTgl())) 
				order.setDoTgl(order.getDoTgl().substring(0, 10));
		}
			
		return orders;
	}
}
