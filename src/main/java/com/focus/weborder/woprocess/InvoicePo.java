package com.focus.weborder.woprocess;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fcs_om_wo_ar_invoice")
public class InvoicePo {

	@Id
	@Column(name="TRX_NUMBER")
	private String invoiceNumber;

	private String custPoNumber;
	private Integer custId;

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getCustPoNumber() {
		return custPoNumber;
	}

	public void setCustPoNumber(String custPoNumber) {
		this.custPoNumber = custPoNumber;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	
	
}
