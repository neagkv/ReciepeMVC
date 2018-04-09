package com.reciepe.controllers;

import com.reciepe.service.RecipeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import static org.mockito.Mockito.*;


import static org.junit.Assert.*;

/**
 * @author Kevin Neag
 */
public class IndexControllerTest {

    @Mock
    RecipeService recipeService;

    @Mock
    Model model;

    IndexController controller;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        controller = new IndexController(recipeService);
    }

    @Test
    public void getIndex() throws Exception {

        String viewName = controller.getIndex(model);
        assertEquals("index",viewName);
        verify(recipeService,times(1)).getRecipe();
        verify(model,times(1)).addAttribute(eq("recipes"),anySet());
    }

}