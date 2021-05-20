package eCommerceBackendDemo.business.abstracts;

import eCommerceBackendDemo.entities.concretes.User;

public interface UserService {
	
	void register(User user);
	boolean login(String email, String password);

}
