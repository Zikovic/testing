package test2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import service.ServiceTest;
import service.ServiceTest2;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.DEFINED_PORT, classes = App.class, properties = {"server.port=9002"})
public class AppTest{

    @Autowired
    private ServiceTest serviceTest;

    @Autowired
    private ServiceTest2 serviceTest2;

    @Test
    public void exampleTest() {
        System.out.println(serviceTest2 + "::" +serviceTest2.getServiceTest().getTest());
        serviceTest2.add("hello");
        System.out.println(serviceTest2 + "::" +serviceTest2.getServiceTest().getTest());
    }


}
