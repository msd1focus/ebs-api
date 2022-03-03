package fokus.wo.api.invdetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvDetailService {

	@Autowired
	private InvDetailRepository invDetailRepository;
	
	public Iterable<InvDetail> getAllInvDetails(){
		Iterable<InvDetail> invDetails = invDetailRepository.findAll();
		return invDetails;
	}
	
	public List<InvDetail> getByTrxNumber(
			String trxNumber) {
		return invDetailRepository.getByTrxNumber(
					trxNumber);
	}
	
	public List<InvDetail> getByCustomertrxid(Long customerTrxId){
		List<InvDetail> invDetailList = invDetailRepository.getByCustomertrxid(customerTrxId);
		return invDetailList;
	}

}
