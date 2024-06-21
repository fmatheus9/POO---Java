package unifacef.edo.tic.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unifacef.edo.tic.model.entities.BlogEntity;

public interface BlogRepository extends JpaRepository<BlogEntity, Long> {
}
