package unifacef.edo.tic.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unifacef.edo.tic.model.entities.PessoaEntity;

public interface PessoasRepository extends JpaRepository<PessoaEntity, Long> {
}
