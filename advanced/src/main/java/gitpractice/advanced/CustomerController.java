package gitpractice.advanced;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    @RequestMapping("/greet")
    public String greet(){
        return "greet";
    }

}
