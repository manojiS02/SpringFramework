package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/segment")
public class B_Path_Segments_Controller {
    @GetMapping
    public String getMapping2(){
        return "Get Mapping Invoked 1";
    }

    //request narrow downing using path segments
    @GetMapping(path = "/two")
    public String  getMapping1(){
        return "Get Mapping invoked 2";
    }

    @GetMapping(path = "/three")
    public String  getMapping3(){
        return "Get Mapping invoked 3";
    }

    @GetMapping(path = "/three/four")
    public String  getMapping4(){
        return "Get Mapping invoked 3/4";
    }
}
