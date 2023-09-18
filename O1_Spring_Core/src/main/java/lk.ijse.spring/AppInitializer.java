package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.BasicDataSource;
import lk.ijse.spring.pojo.NethuPojo;
import lk.ijse.spring.pojo.TharinPojo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        NethuPojo nethu1 = ctx.getBean(NethuPojo.class);
        NethuPojo nethu2 = ctx.getBean(NethuPojo.class);

        NethuPojo nethu3 = (NethuPojo) ctx.getBean("NethuPOJO");
        TharinPojo tharinPojo = (TharinPojo) ctx.getBean("TharinPOJO");

        nethu1.NethuPojoFucking();

        System.out.println(nethu1);
        System.out.println(nethu2);
        System.out.println(nethu3);
        System.out.println(tharinPojo);

        BasicDataSource bean1 = ctx.getBean(BasicDataSource.class);
        BasicDataSource bean2 = ctx.getBean(BasicDataSource.class);
        BasicDataSource bean3 = (BasicDataSource) ctx.getBean("pool");

        System.out.println(bean1);
        System.out.println(bean2);
        System.out.println(bean3);

    }
}
