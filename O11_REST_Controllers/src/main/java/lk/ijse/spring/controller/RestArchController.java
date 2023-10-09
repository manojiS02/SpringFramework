package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class RestArchController {
    public RestArchController() {
        System.out.println("RestArchController");
    }

    //No need of view resolvers
    //Will return anything you return by wrapping it into a HTTP response if compatible

    //Ambiguous Mapping

    @GetMapping
    public String getMapping1(HttpServletRequest req, HttpServletResponse res){
        String id = req.getParameter("id");
        System.out.println(id);
        return "Get Mapping Invoked 1";
    }

    //if you repeat same http method like this. there will be an error at runtime
    //stating this is an ambiguous mapping
    //    @GetMapping
    //    public String getMapping2(){
    //        return "Get Mapping Invoked 2";
    //    }

    @PostMapping
    public String postMapping(){
        return "Post Method Invoked";
    }

    @PutMapping
    public String putMapping(){
        return "Put Mapping Invoked";
    }

    @DeleteMapping
    public String deleteMapping(){
        return "Delete Mapping Invoked";
    }
}
