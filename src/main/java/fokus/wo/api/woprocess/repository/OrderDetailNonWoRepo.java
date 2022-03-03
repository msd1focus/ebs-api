package fokus.wo.api.woprocess.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fokus.wo.api.woprocess.model.OrderDetailNonWo;

@Repository
public interface OrderDetailNonWoRepo extends JpaRepository<OrderDetailNonWo, String> {

	public List<OrderDetailNonWo> findByNoPoOrderByCoNo (String noPo);
	public List<OrderDetailNonWo> findByCustIdAndNoPoOrderByCoNo (Integer custId, String noPo);
}
