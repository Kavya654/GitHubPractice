package gitpractice.advanced;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @GetMapping("/")
    public String greet(@ModelAttribute("customer") Customer customer) {
        return "greet";
    }

    @PostMapping("/form")
    public String form(@ModelAttribute("customer") Customer customer) {

        return "form";
    }



}
