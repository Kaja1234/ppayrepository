package com.dxc.jpa.dao;

import com.dxc.jpa.entities.*;

public interface IDao {
	
	public abstract void addCustomer(Customer customers);
	public abstract void removeId(int customerID);
	public abstract Customer findCustomerByCity(String city);
	public abstract void beginTransaction();
	public abstract void commitTransaction();

}
