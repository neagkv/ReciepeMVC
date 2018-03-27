package reciepe.service;

import org.springframework.stereotype.Service;
import reciepe.domain.Recipe;
import reciepe.repos.RecipeRepo;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Kevin Neag
 */
@Service
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepo recipeRepo;

    public RecipeServiceImpl(RecipeRepo recipeRepo) {
        this.recipeRepo = recipeRepo;
    }

    @Override
    public Set<Recipe> getRecipe() {

        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepo.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }


}
