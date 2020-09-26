package com.dxc.jpa.service;
import com.dxc.jpa.entities.*;

public interface IService {
	
	public abstract void addCustomer(Customer customers);
	public abstract void removeId(int customerID);
	public abstract Customer findCustomerByCity(String city);

}
