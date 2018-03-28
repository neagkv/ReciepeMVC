package com.reciepe.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.reciepe.service.RecipeServiceImpl;

/**
 * @author Kevin Neag
 */
@Slf4j
@Controller
public class IndexController {

    private RecipeServiceImpl recipeService;


    public IndexController(RecipeServiceImpl recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndex(Model model){
        model.addAttribute("recipes",recipeService.getRecipe());
        log.debug("Im the controller");
        return "index";
    }
}
