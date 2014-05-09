package ru.akorolev.wsClientImpl;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import ru.akorolev.jaxws.HelloService;
import ru.akorolev.jaxws.SayHiRequest;
import ru.akorolev.jaxws.SayHiResponse;

/**
 * Created by akorolev on 5/9/14.
 */
public class SimpleClient {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());
        factory.setServiceClass(HelloService.class);
        factory.setAddress("http://localhost:8080/HelloService3");
        HelloService client = (HelloService) factory.create();

        SayHiRequest request = new SayHiRequest();
        request.setRequest("request value");
        SayHiResponse response = client.sayHi(request);
        System.out.println("Server said: " + response.getResponse());
    }
}
