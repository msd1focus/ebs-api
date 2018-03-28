package com.focus.weborder.invoicesall;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class InvoiceAllController {

	@Autowired
	private InvoicesAllService invoicesAllService;

	@RequestMapping("/invoicesall")
	public List<InvoicesAll> getAll(){
		return invoicesAllService.getAll();
	}
}
