package com.focus.weborder.invdetail;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface InvDetailRepository
	extends CrudRepository<InvDetail, Long>{
	
	@Query("SELECT id FROM InvDetail id"
           )
	List<InvDetail> getAll();
	
	@Query("SELECT id FROM InvDetail id WHERE "
            + "id.trxNumber = :trxNumber "
            + "ORDER BY id.lineNumber ASC"
           )
	List<InvDetail> getByTrxNumber(
			@Param("trxNumber") String trxNumber
    	);
}
