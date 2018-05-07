package com.reciepe.service;

import com.reciepe.command.RecipeCommand;
import com.reciepe.converters.RecipeCommandToRecipe;
import com.reciepe.converters.RecipeToRecipeCommand;
import com.reciepe.domain.Recipe;
import com.reciepe.repos.RecipeRepository;
import javafx.beans.binding.When;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

/**
 * @author Kevin Neag
 */
public class RecipeServiceImplTest {

    @RunWith(SpringRunner.class)
    @SpringBootTest
    public class RecipeServiceIT {

        public static final String NEW_DESCRIPTION = "New Description";

        @Autowired
        RecipeService recipeService;

        @Autowired
        RecipeRepository recipeRepository;

        @Autowired
        RecipeCommandToRecipe recipeCommandToRecipe;

        @Autowired
        RecipeToRecipeCommand recipeToRecipeCommand;

        @Transactional
        @Test
        public void testSaveOfDescription() throws Exception {
            //given
            Iterable<Recipe> recipes = recipeRepository.findAll();
            Recipe testRecipe = recipes.iterator().next();
            RecipeCommand testRecipeCommand = recipeToRecipeCommand.convert(testRecipe);

            //when
            testRecipeCommand.setDescription(NEW_DESCRIPTION);
            RecipeCommand savedRecipeCommand = recipeService.saveRecipeCommand(testRecipeCommand);

            //then
            assertEquals(NEW_DESCRIPTION, savedRecipeCommand.getDescription());
            assertEquals(testRecipe.getId(), savedRecipeCommand.getId());
            assertEquals(testRecipe.getCategories().size(), savedRecipeCommand.getCategories().size());
            assertEquals(testRecipe.getIngredients().size(), savedRecipeCommand.getIngredients().size());
        }
    }

}