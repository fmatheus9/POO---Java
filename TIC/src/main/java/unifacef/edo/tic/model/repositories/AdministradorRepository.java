package unifacef.edo.tic.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unifacef.edo.tic.model.entities.AdministradorEntity;

public interface AdministradorRepository extends JpaRepository<AdministradorEntity, Long> {
}
