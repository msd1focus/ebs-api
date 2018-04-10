package com.focus.weborder.invdetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvDetailService {

	@Autowired
	private InvDetailRepository invDetailRepository;
	
	public List<InvDetail> getAllInvDetails(){
		List<InvDetail> invDetails = invDetailRepository.getAll();
		return invDetails;
	}
	
	public List<InvDetail> getByTrxNumber(
			String trxNumber) {
		return invDetailRepository.getByTrxNumber(
					trxNumber);
	}
	
	public List<InvDetail> getByCustomertrxid(
			Long customerTrxId){
		return invDetailRepository.getByCustomertrxid(
				customerTrxId);
	}

}
