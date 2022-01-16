package com.org.f;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    
    CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
    
    Customer customer = new Customer(1, "ABC", 20);
    
    customerDAO.insert(customer);
    
    Customer customer1 = customerDAO.findByCustomerId(1);
    System.out.println(customer1);
    
    }
}
