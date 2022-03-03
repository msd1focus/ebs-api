package fokus.wo.api.woprocess.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fokus.wo.api.woprocess.model.OrderHdrNonWo;


@Repository
public interface OrderHdrNonWoRepo extends JpaRepository<OrderHdrNonWo, String> {

	public List<OrderHdrNonWo> findByCustomerIdAndTglPoBetweenOrderByCustPoNoDesc (Integer custId, Date date1, Date date2);
	public List<OrderHdrNonWo> findByCustomerId (Integer custId);
	
}
