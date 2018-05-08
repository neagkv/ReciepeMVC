package com.reciepe.service;

import com.reciepe.command.IngredientCommand;

/**
 * @author Kevin Neag
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
