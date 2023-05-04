package annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Hello {

    @Bean(name = "welcome")
    public Welcome2 getWelcome2() {
        return new Welcome2();
    }

    @Bean(name = "hi")
    public String getMessage() {
        String hello = "Hi man!";
        return hello;
    }
}
