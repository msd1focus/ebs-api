package com.focus.weborder.woprocess.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.focus.weborder.woprocess.model.InvoicePo;

@Repository
public interface InvoicePoRepo extends JpaRepository<InvoicePo, String> {

	public List<InvoicePo> findByCustPoNumberAndCustId (String poNumber, Integer custId);
}
