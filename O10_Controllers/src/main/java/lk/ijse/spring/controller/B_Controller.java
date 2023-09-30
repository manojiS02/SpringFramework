package lk.ijse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/a")
public class B_Controller {
    @GetMapping
    public ModelAndView test(){
        ModelAndView m = new ModelAndView("/customer");
        m.addObject("ID","C005");
        return m;
    }
}
