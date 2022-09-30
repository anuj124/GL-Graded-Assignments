package com.greatlearning.library.service;

import java.util.List;

import org.hibernate.Transaction;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.greatlearning.library.entity.Customer;

@Repository
public class CustomerServiceImp implements CustomerService {

	private SessionFactory sessionFactory;
	private Session session;
	
	
	@Autowired
	public CustomerServiceImp(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		try {
			session = sessionFactory.getCurrentSession();
		}
		catch(HibernateException e){
			session = sessionFactory.openSession();
		}
	}

	@Override
	@Transactional
	public List<Customer> findAll() {
		Transaction tx = session.beginTransaction();
		List<Customer> customers = session.createQuery("from Customer").list();
		tx.commit();
		return customers;
	}

	@Override
	@Transactional
	public Customer findByID(int customerId) {
		Customer customer= new Customer();
		Transaction tx = session.beginTransaction();
		customer= session.get(Customer.class, customerId);
		tx.commit();
		return customer;
	}

	@Override
	@Transactional
	public void save(Customer theCustomer) {
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(theCustomer);
		tx.commit();
		
	}

	@Override
	@Transactional
	public void deleteById(int customerId) {
		Transaction tx = session.beginTransaction();
		Customer customer = session.get(Customer.class, customerId);
		session.delete(customer);
		tx.commit();
		
	}

}
