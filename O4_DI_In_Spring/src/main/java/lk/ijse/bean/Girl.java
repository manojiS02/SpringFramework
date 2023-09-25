package lk.ijse.bean;

import org.springframework.stereotype.Component;

@Component
public class Girl implements Inter{
    public Girl(){
        System.out.println("Girl Instantiated");
    }

    @Override
    public void Chatting(){
        System.out.println("La la");
    }
}
