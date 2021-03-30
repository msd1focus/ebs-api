package com.focus.weborder.woprocess.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.focus.weborder.woprocess.model.OrderDetailNonWo;

@Repository
public interface OrderDetailNonWoRepo extends JpaRepository<OrderDetailNonWo, String> {

	public List<OrderDetailNonWo> findByNoPoOrderByCoNo (String noPo);
}
