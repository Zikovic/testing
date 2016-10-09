package test2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import service.ServiceTest;

/**
 * Created by benal on 06/10/2016.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.DEFINED_PORT, classes = App.class)
public class AppTest2 {

    @Autowired
    private ServiceTest serviceTest;



    @Test
    public void testU(){
        System.out.println(serviceTest + "::" +serviceTest.getTest());
    }
}
