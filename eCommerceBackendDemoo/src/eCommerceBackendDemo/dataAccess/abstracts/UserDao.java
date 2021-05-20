package eCommerceBackendDemo.dataAccess.abstracts;

import java.util.List;

import eCommerceBackendDemo.entities.concretes.User;

public interface UserDao {
	
	void add (User user);
	void update (User user);
	void delete (User user);
	List<User> getAll();
	User get(int id);


}
