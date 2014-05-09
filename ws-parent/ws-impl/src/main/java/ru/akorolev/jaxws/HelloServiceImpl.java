package ru.akorolev.jaxws;

/**
 * Created by akorolev on 5/4/14.
 */
public class HelloServiceImpl implements HelloService{
    @Override
    public SayHiResponse sayHi(SayHiRequest parameters) {
        SayHiResponse response = new SayHiResponse();
        response.setResponse("value123 " + parameters.getRequest());
        return response;
    }
}
