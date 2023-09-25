package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PojoOne implements InitializingBean {
    @Value("Galle IJSE")
    private String address;
    public PojoOne(@Value("C001,C002,C003") String[] id){
        System.out.println("Pojo one instantiated"+id);
        System.out.println(address);

        for (String Id : id){
            System.out.println(Id);
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.address);
    }

    @Autowired(required = false)
    public PojoOne (@Value("Dasun")String name){
        System.out.println("Constructor one");
    }
}
