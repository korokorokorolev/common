package ru.akorolev.ru.akorolev.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.akorolev.services.SimpleServiceImpl;

/**
 * Created by akorolev on 5/10/14.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ((SimpleServiceImpl)context.getBean("repo")).printValue();
    }
}
