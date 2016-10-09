package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by benal on 06/10/2016.
 */
@Component
public class ServiceTest2 {


    @Autowired
    private ServiceTest serviceTest;

    public void add(String str){
        serviceTest.setTest(str);
    }

    public void setServiceTest(ServiceTest serviceTest) {
        this.serviceTest = serviceTest;
    }

    public ServiceTest getServiceTest() {
        return serviceTest;
    }
}
