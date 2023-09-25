package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PojoOne implements InitializingBean {
    @Value("${USERNAME}")
    private String userName;
    @Value("${os.name}")
    private String osName;
    @Value("${url}")
    private String url;
    @Value("${dbUserName}")
    private String dbUsername;
    @Autowired
    Environment environment;
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.userName);
        System.out.println(this.osName);
        System.out.println(this.url);
        System.out.println(this.dbUsername);
        System.out.println(this.environment);
        System.out.println("==================================================");

        String user = environment.getProperty("USERNAME");
        String user1 = environment.getProperty("url");
        System.out.println(user);
        System.out.println(user1);
    }
}
