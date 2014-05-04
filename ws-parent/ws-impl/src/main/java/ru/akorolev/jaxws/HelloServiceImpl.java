package ru.akorolev.jaxws;

/**
 * Created by akorolev on 5/4/14.
 */
public class HelloServiceImpl implements HelloService{
    @Override
    public SayHiResponse sayHi(SayHi parameters) {
        SayHiResponse response = new SayHiResponse();
        response.setResponse("value " + parameters);
        return response;
    }
}
