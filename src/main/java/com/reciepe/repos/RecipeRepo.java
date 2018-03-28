package com.reciepe.repos;

import org.springframework.data.repository.CrudRepository;
import com.reciepe.domain.Recipe;

/**
 * @author Kevin Neag
 */
public interface RecipeRepo extends CrudRepository<Recipe,Long> {
}
