package hibernateDemo.com.org.hibernate;
import java.util.HashSet;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.util.HibernateUtil;


public class Main {

    public static void main(String a[])
    {
    	
    	System.out.println( "Hello World!" );
    	Configuration cfg= new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory fact = cfg.buildSessionFactory();
    	Session sess= fact.openSession();
    	sess.beginTransaction();
Vendor1 vendor =new Vendor1();
    	vendor.setVendorId(100);
    	vendor.setVendorName("IBM");
    	Customer customer=new Customer();
    	customer.setCustomerId(102);
    	customer.setCustomerName("NIFY");
    	customer.setCustomerAddress("BANG");
    	Customer customer2=new Customer();
    	customer2.setCustomerId(104);
    	customer2.setCustomerName("TCS");
    	customer2.setCustomerAddress("HYD"); 
    	Customer customer3=new Customer();
    	customer3.setCustomerId(105);
    	customer3.setCustomerName("VERIZON");
    	customer3.setCustomerAddress("US");
    	
    	Set<Customer> customers = new HashSet<>();
    	customers.add(customer);
    	customers.add(customer2);
    	customers.add(customer3);
    	vendor.setCustomers(customers); 
    	//sess.save(customers);
    	sess.save(vendor);
    	sess.getTransaction().commit();
    	System.out.println("Data Saved Successfully");
    	sess.close(); }
    	}

    