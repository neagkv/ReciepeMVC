package reciepe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import reciepe.domain.Category;
import reciepe.domain.UnitOfMeasure;
import reciepe.repos.CategoryRepo;
import reciepe.repos.UnitOfMeasureRepo;
import reciepe.service.RecipeServiceImpl;

import java.util.Optional;

/**
 * @author Kevin Neag
 */

@Controller
public class IndexController {

    private RecipeServiceImpl recipeService;


    public IndexController(RecipeServiceImpl recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndex(Model model){
        model.addAttribute("recipes",recipeService.getRecipe());
        return "index";
    }
}
