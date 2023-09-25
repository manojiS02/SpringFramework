package lk.ijse.spring.config;

import com.oracle.webservices.internal.api.message.PropertySet;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
@PropertySource("classpath:resource.properties")
public class AppConfig {
    public AppConfig(){
        System.out.println("App config instantiated");
    }
}
