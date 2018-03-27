package reciepe.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import reciepe.domain.Recipe;

/**
 * @author Kevin Neag
 */
public interface RecipeRepo extends CrudRepository<Recipe,Long> {
}
