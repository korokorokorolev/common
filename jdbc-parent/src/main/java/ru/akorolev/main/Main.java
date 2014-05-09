package ru.akorolev.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.akorolev.dataacces.DAO;

/**
 * Created by akorolev on 5/9/14.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("db-config.xml");
        DAO dao = (DAO) context.getBean("dao");
        System.out.println(dao.getValueById(1));
    }
}
