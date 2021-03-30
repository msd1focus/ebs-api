package com.focus.weborder.woprocess;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderHdrNonWoRepo extends JpaRepository<OrderHdrNonWo, String> {

	public List<OrderHdrNonWo> findByCustomerIdAndTglPoBetween (Integer custId, Date date1, Date date2);
	public List<OrderHdrNonWo> findByCustomerId (Integer custId);
	
}
