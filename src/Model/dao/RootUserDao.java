package Model.dao;

import Model.Beans.RootUser;

public interface RootUserDao {

	public void createRootUser(RootUser r);
	public void updateRootUser(RootUser r);
	public void deleteRootUser(String id);
	public RootUser selectRootUser(String id);
}
