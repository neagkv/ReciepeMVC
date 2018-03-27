package reciepe.repos;

import org.springframework.data.repository.CrudRepository;
import reciepe.domain.Category;

/**
 * @author Kevin Neag
 */
public interface CategoryRepo extends CrudRepository<Category,Long> {
}
