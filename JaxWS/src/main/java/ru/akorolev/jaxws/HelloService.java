package ru.akorolev.jaxws;

import javax.jws.WebService;

/**
 * Created by akorolev on 5/2/14.
 */
@WebService
public interface HelloService {
    public String sayHi(String text);
}
