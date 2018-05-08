package com.reciepe.service;

import com.reciepe.command.RecipeCommand;
import com.reciepe.domain.Recipe;

import java.util.Set;

/**
 * @author Kevin Neag
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);

}
