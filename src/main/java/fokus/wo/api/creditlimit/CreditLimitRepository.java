package fokus.wo.api.creditlimit;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CreditLimitRepository 
	extends CrudRepository<CreditLimit, Long>{
	
	@Query("SELECT cl FROM CreditLimit cl"
           )
	List<CreditLimit> getAll();
	
	@Query("SELECT cl FROM CreditLimit cl WHERE "
            + "cl.custId = :custId"
           )
	List<CreditLimit> getByCust(
			@Param("custId") Long custId
    	);
}
