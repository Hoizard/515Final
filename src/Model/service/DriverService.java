package Model.service;

import Model.Beans.Driver;

public interface DriverService {

	public void createDriver(String id, String password, String name, String car_id, String receipt);
	public void deleteDriver(String id);
	public void updateDriver(String id, String password, String name,String car_id, String receipt);
	public Driver selectDriver(String id);
}
