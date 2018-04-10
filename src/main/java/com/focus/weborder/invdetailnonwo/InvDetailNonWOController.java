package com.focus.weborder.invdetailnonwo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class InvDetailNonWOController {

	@Autowired
	private InvDetailNonWOService invDetailNonWOService;
	
	@RequestMapping("/invdetailnonwos")
	public List<InvDetailNonWO> getAll(){
		return invDetailNonWOService.getAllInvDetails();
	}
	
	@RequestMapping("/invdetailnonwo/trxnumber")
	public List<InvDetailNonWO> getByTrxNumber(
			@RequestParam String trxnumber){
		return invDetailNonWOService.getByTrxNumber(trxnumber);
	}
	
	@RequestMapping("/invdetailnonwo/custid")
	public List<InvDetailNonWO> getByCustid(
			@RequestParam Long custid){
		return invDetailNonWOService.getByCustid(custid);
	}

}
