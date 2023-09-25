package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoThree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
public class ConfigThree {
    public ConfigThree(){
        System.out.println("Config three instantiated");
    }

    @Bean
    public PojoThree pojoThree(){
        return new PojoThree();
    }
}
