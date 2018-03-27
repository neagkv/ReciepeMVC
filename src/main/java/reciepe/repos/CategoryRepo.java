package reciepe.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import reciepe.domain.Category;

import java.util.Optional;

/**
 * @author Kevin Neag
 */

public interface CategoryRepo extends CrudRepository<Category,Long> {

    Optional<Category> findByDescription(String description);
}
