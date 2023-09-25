package lk.ijse.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy implements Inject {

    //Property injection
//    @Autowired
    Inter girl;


    // Constructor Injection
//    @Autowired
    public Boy(Inter girl){
//        this.girl=girl;
        System.out.println("Boy Instantiated");
    }


    //setter method injection
//    @Autowired
    public void setGirl(Inter girl){
//        this.girl=girl;
    }


    public void trying(){
        girl.Chatting();
    }


    //Interface through injection
    @Autowired
    @Override
    public void setInject(Inter gg) {
        this.girl=gg;
    }
}