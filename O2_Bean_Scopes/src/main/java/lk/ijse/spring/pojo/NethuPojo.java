package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component("nethu-bro")
public class NethuPojo {
    public NethuPojo(){
        System.out.println("Nethu Pojja");
    }



    public void nethuIsDancing(){
        System.out.println("La la la la ala al");
    }
}