package fokus.wo.api.creditlimit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditLimitService {

	@Autowired
	private CreditLimitRepository creditLimitRepository;
	
	public List<CreditLimit> getAll(){
		List<CreditLimit> creditLimits = creditLimitRepository.getAll();
		return creditLimits;
	}
	
	public List<CreditLimit> getByCust(Long custId) {
		List<CreditLimit> creditLimits = creditLimitRepository.getByCust(custId);
		return creditLimits;
	}

}
