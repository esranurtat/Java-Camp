package eCommerceBackendDemo.core.concretes;

import eCommerceBackendDemo.business.abstracts.UserService;
import eCommerceBackendDemo.entities.concretes.User;
import google.GoogleManager;

public class GoogleManagerAdapter implements UserService{
	
	GoogleManager google;
	
	public GoogleManagerAdapter() {
		google = new GoogleManager();
	}
	
	@Override
	public void register(User user) {
		
		if(user.getPassword().length()>10) {
			google.register(user.getEmail(), user.getPassword());
		}
		else {
			System.out.println("Google ile kayit için uygun sifre degil!");
		}
		
	}

	@Override
	public boolean login (String email, String password) {
		
		if(password.equals("0000") && password.isEmpty()) {
			google.login(email, password);
			return true;
		}
		
		return false;
	}

}
