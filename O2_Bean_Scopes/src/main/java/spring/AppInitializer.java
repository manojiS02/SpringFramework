package spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.TharinPojo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        TharinPojo bean1 = ctx.getBean(TharinPojo.class);
        System.out.println(bean1);

        TharinPojo bean2 = ctx.getBean(TharinPojo.class);
        System.out.println(bean2);
    }
}
