package com.focus.weborder.woprocess.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="fcs_om_wo_order_summary")
public class OrderHdrNonWo {

	@Id
	@Column(name="CUST_PO_NUMBER")
	private String custPoNo;

	@Column(name="TGL_PO")
    @JsonFormat(pattern="yyyy-MM-dd")
	private Date tglPo;
	
	private Integer customerId;
	private Double total;

	@Transient
	private List<String> invoices;
	
	public String getCustPoNo() {
		return custPoNo;
	}

	public void setCustPoNo(String custPoNo) {
		this.custPoNo = custPoNo;
	}

	public Date getTglPo() {
		return tglPo;
	}

	public void setTglPo(Date tglPo) {
		this.tglPo = tglPo;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public List<String> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<String> invoices) {
		this.invoices = invoices;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	
}
