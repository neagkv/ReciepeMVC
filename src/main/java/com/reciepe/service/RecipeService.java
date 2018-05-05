package com.reciepe.service;

import com.reciepe.command.RecipeCommand;
import com.reciepe.domain.Recipe;

import java.util.Set;

/**
 * @author Kevin Neag
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

}
