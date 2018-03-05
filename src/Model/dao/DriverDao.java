package Model.dao;

import Model.Beans.Driver;

public interface DriverDao {

	public void createDriver(Driver d);
	public void deleteDriver(String id);
	public void updateDriver(Driver d);
	public Driver selectDriver(String id);
}
