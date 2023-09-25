package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
public class ConfigTwo {
    public ConfigTwo(){
        System.out.println("Config two instantiated");
    }

    @Bean
    public PojoTwo pojoTwo(){
        return new PojoTwo();
    }
}
