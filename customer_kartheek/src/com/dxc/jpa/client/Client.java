package com.dxc.jpa.client;
import java.util.Scanner;

import com.dxc.jpa.entities.Customer;
import com.dxc.jpa.service.*;

public class Client {
	
	public static void main(String[] args) {
		IService serve = new ServiceImplementation();
		
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("CUSTOMER DETAILS");
			System.out.println("1. ENTER CUSTOMER DETAILS");
			System.out.println("2. REMOVE CUSTOMER BY CUSTOMERID");
			System.out.println("3. CUSTOMER DETAILS BY CITY");
			System.out.println("4. EXIT");
			
			int choice = s.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("CUSTOMER ID");
				int customerID = s.nextInt();
				s.nextLine();
				
				System.out.println("ENTER NAME");
				String customerName = s.nextLine();
				
				System.out.println("ENTER CITY NAME");
				String city = s.nextLine();
				
				System.out.println("ENTER BILL AMOUNT");
				int billAmount = s.nextInt();
				
				Customer cs = new Customer();
				cs.setCustomerID(customerID);
				cs.setCustomerName(customerName);
				cs.setCity(city);
				cs.setBillAmount(billAmount);
				
				serve.addCustomer(cs);
				
				break;
				
			case 2:
				System.out.println("CUSTOMER ID");
				int customersID1 = s.nextInt();
				serve.removeId(customersID1);
				break;
				
			case 3:
				System.out.println("CUSTOMER DETAILS BY CITY");
				String cityname = s.nextLine();
				serve.findCustomerByCity(cityname);
				break;
			case 4:
				System.out.println("THANK YOU");
				break;
				
			default:
					break;
				
			}
			
		}while(true);
		
		
	}

}
