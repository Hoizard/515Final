package Model.service;

import Model.Beans.RootUser;

public interface RootUserService {

	public void createRootUser(String id, String password, String name, String ad);
	public void deleteRootUser(String id);
	public void updateRootUser(String id, String password, String name, String ad);
	public RootUser selectRootUser(String id);
}
