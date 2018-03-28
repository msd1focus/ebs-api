package com.focus.weborder.creditlimit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest")
public class CreditLimitController {

	@Autowired
	private CreditLimitService creditLimitService;
	
	@RequestMapping("/creditlimits")
	public List<CreditLimit> getAll(){
		return creditLimitService.getAll();
	}
	
	@RequestMapping("/creditlimit")
	public List<CreditLimit> getByCust(
			@RequestParam Long custid){
		return creditLimitService.getByCust(custid);
	}

}
