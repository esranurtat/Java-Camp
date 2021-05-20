package eCommerceBackendDemo;

import eCommerceBackendDemo.business.abstracts.UserService;
import eCommerceBackendDemo.business.concretes.UserManager;
import eCommerceBackendDemo.core.concretes.GoogleManagerAdapter;
import eCommerceBackendDemo.dataAccess.concretes.HibernateUserDao;
import eCommerceBackendDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		

		User user1 = new User(1,"Esra","Tat","esranurtat@gmail.com","9876542310574");
		User user2 = new User(2,"Kenan","Aaa","kenanaaa@hotmail.com","123456745620852");
		
		UserService userService = new UserManager(new HibernateUserDao());
		//UserService userService = new GoogleManagerAdapter();
		userService.register(user1);
		userService.register(user2);
		userService.login(user1.getEmail(), user1.getPassword());
		userService.login(user2.getEmail(), user2.getPassword());
		

	}

}
