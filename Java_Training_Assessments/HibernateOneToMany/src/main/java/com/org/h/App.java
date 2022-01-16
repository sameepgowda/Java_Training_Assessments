package com.org.h;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Pojo.Vendor;
import Pojo.Customer;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory fact = cfg.buildSessionFactory();
        Session sess = fact.openSession();
        sess.beginTransaction();
        
        
        Vendor vendor = new Vendor();
        vendor.setVendorId(101);
        vendor.setVendorName("IBM");
        
        Customer customer = new Customer();
        customer.setCustomerId(102);
        customer.setCustomerName("NIFY");
        customer.setCustomerAddress("BANG");
        
        Customer customer2 = new Customer();
        customer2.setCustomerId(104);
        customer2.setCustomerName("TCS");
        customer2.setCustomerAddress("HYD");
        
        Customer customer3 = new Customer();
        customer3.setCustomerId(105);
        customer3.setCustomerName("VERIZON");
        customer3.setCustomerAddress("US");
        
        Set customers = new HashSet();
        customers.add(customer);
        customers.add(customer2);
        customers.add(customer3);
        
        vendor.setCustomers(customers);

        sess.save(vendor);
        sess.save(customer);
        sess.save(customer2);
        sess.save(customer3);
      //  sess.save(customers); no need to save the hashset 
        
        sess.getTransaction().commit();
        System.out.println("Success");
        sess.close();
        fact.close();
        
        
        		
    }
}
