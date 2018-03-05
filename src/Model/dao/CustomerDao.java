package Model.dao;

import Model.Beans.Customer;

public interface CustomerDao {

	public void createCustomer(Customer c);
	public void deleteCustomer(String id);
	public void updateCustomer(Customer c);
	public Customer selectCustomer(String id);
}
