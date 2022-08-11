package CheckingStuff.HerokuTester20;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

@RequestMapping(path = "/nextpage")
public class TheController {
    
    @GetMapping
    public String displayNextPage(
        @RequestParam(name = "theItem") String item,
        Model model)
        {

            model.addAttribute("theOutput",item);
            return "nextpage";
        }
    
}
