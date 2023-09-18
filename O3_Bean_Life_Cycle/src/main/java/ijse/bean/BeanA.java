package ijse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BeanA implements BeanNameAware , BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public BeanA(){
        System.out.println("Instantiated-BeanA : Constructor");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name awareness");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean factory awareness");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable Bean A");
    }
}