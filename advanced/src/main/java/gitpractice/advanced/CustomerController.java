package gitpractice.advanced;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    @RequestMapping("/greet")
    public ModelAndView greet(@RequestParam("cname")String cname) {

        ModelAndView mv = new ModelAndView();
        mv.addObject("cname", cname);
        mv.setViewName("greet");

        return mv;
    }

}
