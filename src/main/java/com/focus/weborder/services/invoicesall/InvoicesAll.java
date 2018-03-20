package com.focus.weborder.services.invoicesall;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AP_INVOICES_ALL", schema= "AP")
public class InvoicesAll {

	@Id
	@Column(name="INVOICE_ID")
	private Long invoiceId;
	
	public InvoicesAll() {
	}
	
	public InvoicesAll(Long invoiceId) {
		super();
		this.invoiceId = invoiceId;
	}

	public Long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}

}
