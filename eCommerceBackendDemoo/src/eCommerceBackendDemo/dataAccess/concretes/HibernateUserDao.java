package eCommerceBackendDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceBackendDemo.dataAccess.abstracts.UserDao;
import eCommerceBackendDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
private List<User> userList;
	
	public HibernateUserDao() {
		userList = new ArrayList<>();
	}
	
	@Override
	public void add(User user) {
		userList.add(user);
	}

	@Override
	public void update(User user) {
		for(User u: userList) {
			if(user.getId() == u.getId()) {
				u.setFirstName(user.getFirstName());
				u.setLastName(user.getLastName());
				u.setEmail(user.getEmail());
				u.setPassword(user.getPassword());
				break;
			}
		}
	}

	@Override
	public void delete(User user) {
		userList.remove(user.getId());
	}

	@Override
	public List<User> getAll() {
		return userList;
	}
	
	@Override 
	public User get(int id) {
		for(User user: userList) {
			if(id == user.getId()) {
				return user;
			}
		}
		return null;
	}

}
