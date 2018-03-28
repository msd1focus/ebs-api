package com.focus.weborder.creditlimit;

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
	
	public List<CreditLimit> getByCust(
			Long custId) {
		List<CreditLimit> creditLimits = 
				creditLimitRepository.getByCust(custId);
		/*DecimalFormat df = new DecimalFormat("###.##");
		for(CreditLimit cl: creditLimits) {
			System.out.println("before: " + cl.getOverallCreditLimit());
			System.out.println("format: " + df.format(cl.getOverallCreditLimit()));
			cl.setOverallCreditLimit(
					Double.valueOf(df.format(cl.getOverallCreditLimit())));
			System.out.println("after: " + cl.getOverallCreditLimit());
		}*/
		return creditLimits;
	}

}
