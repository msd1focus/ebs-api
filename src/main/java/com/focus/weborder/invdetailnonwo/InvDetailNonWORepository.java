package com.focus.weborder.invdetailnonwo;

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
}
