package lk.ijse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/http")
public class A_HTTP_Methods_Controller {
    @GetMapping
    public String getMapping(){
        return "Get Mapping Invoked 1";
    }

    //    @GetMapping
    //    public String getMapping2(){
    //        return "Get Mapping Invoked 2";
    //    }

    //post
    @PostMapping
    public String postMapping(){
        return "Post Mapping Invoked";
    }

    //put
    @PutMapping
    public String putMapping(){
        return "Put Mapping Invoked";
    }

    //delete
    @DeleteMapping
    public String deleteMapping(){
        return "Delete Mapping Invoked";
    }

}
