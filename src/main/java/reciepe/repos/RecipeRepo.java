package reciepe.repos;

import org.springframework.data.repository.CrudRepository;
import reciepe.domain.Recipe;

/**
 * @author Kevin Neag
 */
public interface RecipeRepo extends CrudRepository<Recipe,Long> {
}
