package lk.ijse.spring.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TharinPojo {
    public TharinPojo(){
        System.out.println("Tharin Pojja");
    }
}