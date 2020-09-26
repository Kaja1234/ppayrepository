package com.dxc.jpa.service;

import com.dxc.jpa.dao.*;
import com.dxc.jpa.entities.Customer;

public class ServiceImplementation implements IService{
	private IDao dao;
	
	public ServiceImplementation() {
		dao = new Daoimp();
	}

	@Override
	public void addCustomer(Customer customers) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addCustomer(customers);
		dao.commitTransaction();
		
	}

	@Override
	public void removeId(int customerID) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeId(customerID);
		dao.commitTransaction();
		
	}

	@Override
	public Customer findCustomerByCity(String city) {
		// TODO Auto-generated method stub
		Customer customers = dao.findCustomerByCity(city);
		
		return customers;
	}

}
