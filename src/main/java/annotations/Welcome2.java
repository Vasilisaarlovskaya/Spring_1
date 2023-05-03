package annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Welcome2 {
    @Autowired
    String hello;

    public void getMassage() {
        System.out.println(hello);
    }
}
