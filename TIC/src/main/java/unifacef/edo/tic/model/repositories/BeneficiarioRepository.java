package unifacef.edo.tic.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unifacef.edo.tic.model.entities.BeneficiarioEntity;

public interface BeneficiarioRepository extends JpaRepository<BeneficiarioEntity, Long> {
}
