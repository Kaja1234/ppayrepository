package com.dxc.jpa.dao;
import javax.persistence.EntityManager;
import com.dxc.jpa.entities.*;

public class Daoimp implements IDao{
	private EntityManager entitymanager;
	
	public Daoimp() {
		entitymanager = JPAUtil.getEntityManager();
	}

	@Override
	public void addCustomer(Customer customers) {
		// TODO Auto-generated method stub
		entitymanager.persist(customers);
		
	}

	@Override
	public void removeId(int customerID) {
		// TODO Auto-generated method stub
		entitymanager.remove(customerID);
		
	}

	@Override
	public Customer findCustomerByCity(String city) {
		// TODO Auto-generated method stub
		Customer customers = entitymanager.find(Customer.class, city);
		return customers;
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entitymanager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		entitymanager.getTransaction().commit();
		
	}

}
