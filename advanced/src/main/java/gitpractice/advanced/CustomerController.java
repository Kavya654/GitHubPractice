package gitpractice.advanced;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {

    @Autowired
    CustomerService serv;

    @GetMapping("/")
    public String greet(@ModelAttribute("customer") Customer customer) {

        return "greet";
    }

    @PostMapping("/form")
    public String form(@ModelAttribute("customer") Customer customer) {

        serv.save(customer);
        return "form";
    }

    @PostMapping("/findCustomerbyId")
    public String findById(@RequestParam("cid") int cid, Model model){

        Customer FoundCustomer = serv.findById(cid);

        model.addAttribute("customer", FoundCustomer);

        return "found";
    }

}
