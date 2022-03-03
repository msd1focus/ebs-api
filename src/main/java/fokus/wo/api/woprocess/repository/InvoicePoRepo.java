package fokus.wo.api.woprocess.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fokus.wo.api.woprocess.model.InvoicePo;


@Repository
public interface InvoicePoRepo extends JpaRepository<InvoicePo, String> {

	public List<InvoicePo> findByCustPoNumberAndCustId (String poNumber, Integer custId);
}
