package com.focus.weborder.invdetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class InvDetailController {
	
	@Autowired
	private InvDetailService invDetailService;
	
	@RequestMapping("/invdetails")
	public List<InvDetail> getAll(){
		return invDetailService.getAllInvDetails();
	}
	
	@RequestMapping("/invdetail")
	public List<InvDetail> getBytrxNumber(
			@RequestParam String trxnumber){
		return invDetailService.getByTrxNumber(trxnumber);
	}
	
	@RequestMapping("/invdetail/customertrxid")
	public List<InvDetail> getByCustomertrxid(
			@RequestParam Long customertrxid){
		return invDetailService.getByCustomertrxid(customertrxid);
	}
}
