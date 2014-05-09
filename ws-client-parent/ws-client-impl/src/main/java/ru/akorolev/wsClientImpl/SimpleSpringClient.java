package ru.akorolev.wsClientImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.akorolev.jaxws.HelloService;
import ru.akorolev.jaxws.SayHiRequest;

/**
 * Created by akorolev on 5/9/14.
 */
public class SimpleSpringClient {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        HelloService service = (HelloService) context.getBean("helloClient");
        SayHiRequest request = new SayHiRequest();
        request.setRequest("val");
        System.out.println(service.sayHi(request).getResponse());
    }
}
