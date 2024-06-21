package unifacef.edo.tic.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unifacef.edo.tic.model.entities.NoticiaEntity;

public interface NoticiasRepository extends JpaRepository<NoticiaEntity, String> {

}
