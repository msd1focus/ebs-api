package com.focus.weborder.woprocess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailInfoRepository extends JpaRepository<OrderDetailInfo, String> {

	public List<OrderDetailInfo> findByOrderId (String orderId);
	public List<OrderDetailInfo> findByCustPoNo (String custPoNo);
	public List<OrderDetailInfo> findByCustPoNoOrderByCoNo (String noPo);
	
}
