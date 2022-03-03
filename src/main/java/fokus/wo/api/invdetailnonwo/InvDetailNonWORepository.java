package fokus.wo.api.invdetailnonwo;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface InvDetailNonWORepository
	extends CrudRepository<InvDetailNonWO, Long>{
	
	@Query("SELECT id FROM InvDetailNonWO id"
           )
	List<InvDetailNonWO> getAll();
	
	@Query("SELECT id FROM InvDetailNonWO id WHERE "
            + "id.trxNumber = :trxNumber "
            + "ORDER BY id.trxDate DESC"
           )
	List<InvDetailNonWO> getByTrxNumber(
			@Param("trxNumber") String trxNumber
    	);
	
	@Query("SELECT id FROM InvDetailNonWO id WHERE "
            + "id.custId = :custId "
            + "ORDER BY id.trxDate DESC"
           )
	List<InvDetailNonWO> getByCustid(
			@Param("custId") Long custId
    	);
	
	@Query("SELECT id FROM InvDetailNonWO id WHERE "
            + "id.custId = :custId AND "
            + "id.trxDate >= :startDate AND "
            + "id.trxDate <= :endDate "
            + "ORDER BY id.trxDate DESC"
           )
	List<InvDetailNonWO> getByCustidStartEnddate(
			@Param("custId") Long custId,
			@Param("startDate") Date startDate,
			@Param("endDate") Date endDate
    	);
}
