package com.focus.weborder.invdetailnonwo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvDetailNonWOService {

	@Autowired
	private InvDetailNonWORepository invDetailNonWORepository;
	
	public List<InvDetailNonWO> getAllInvDetails(){
		List<InvDetailNonWO> invDetails = invDetailNonWORepository.getAll();
		return invDetails;
	}

	public List<InvDetailNonWO> getByTrxNumber(
			String trxNumber){
		return invDetailNonWORepository.getByTrxNumber(
				trxNumber);
	}
	
	public List<InvDetailNonWO> getByCustid(
			String custId){
		return invDetailNonWORepository.getByCustid(
				custId);
	}
}
