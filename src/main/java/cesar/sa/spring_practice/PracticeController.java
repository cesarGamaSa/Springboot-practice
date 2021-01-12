package cesar.sa.spring_practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PracticeController {

    @Autowired
    PracticeService service;

    @RequestMapping("/login")
    public String login() {
        return "index";
    }

    @RequestMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("error", true);
        return "index";
    }

    @RequestMapping("/products")
    public String products(Model model) {
        model.addAttribute("products", service.getAll());
        return "products";
    }

}
