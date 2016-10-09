package service;

import org.springframework.stereotype.Component;

/**
 * Created by benal on 06/10/2016.
 */
@Component
public class ServiceTest {

    private String test;

    public ServiceTest(){
        test = "test";
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
