package lk.ijse.spring.config;

import lk.ijse.spring.AppInitializer;
import lk.ijse.spring.pojo.PojoOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
@Import({ConfigTwo.class, ConfigThree.class})
public class AppConfig {
    public AppConfig(){
        System.out.println("App config Instantiated");
    }

    @Bean
    public PojoOne pojoOne(){
        return new PojoOne();
    }
}
