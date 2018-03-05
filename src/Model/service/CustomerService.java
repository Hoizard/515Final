package Model.service;

import Model.Beans.Customer;

public interface CustomerService {


	public void createCustomer(String id, String password, String name);
	public void deleteCustomer(String id);
	public void updateCustomer(String id, String password, String name);
	public Customer selectCustomer(String id);
}
