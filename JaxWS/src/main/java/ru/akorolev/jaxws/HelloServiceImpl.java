package ru.akorolev.jaxws;

import javax.jws.WebService;

/**
 * Created by akorolev on 5/3/14.
 */
@WebService(endpointInterface = "ru.akorolev.jaxws.HelloService")
public class HelloServiceImpl  implements HelloService{
    @Override
    public String sayHi(String text) {
        return "Hello " + text;
    }
}
