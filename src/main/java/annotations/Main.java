package annotations;

import org.example.Greetings;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Hello.class);
        Welcome2 welcome2 = context.getBean("welcome", Welcome2.class);
        welcome2.getMassage();
    }
}
