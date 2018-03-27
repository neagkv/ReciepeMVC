package reciepe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Kevin Neag
 */

@Controller
public class IndexController {

    @RequestMapping({"","/","/index"})
    public String getIndex(){
        return "index";
    }
}
