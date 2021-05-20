package eCommerceBackendDemo.business.concretes;

import java.util.Scanner;
import java.util.regex.Pattern;

import eCommerceBackendDemo.business.abstracts.UserService;
import eCommerceBackendDemo.dataAccess.abstracts.UserDao;
import eCommerceBackendDemo.entities.concretes.User;

public class UserManager implements UserService{
	
private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void register(User user) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			if(isExistID(user.getId()) &&
			   isValidEmail(user.getEmail()) &&
			   isExistEmail(user.getEmail()) &&
			   user.getFirstName().length() > 2 &&
			   user.getLastName().length() > 2 && 
			   user.getPassword().length() > 6
			   ) 
			{
				System.out.println("sartlar saglaniyor");
					int systemCode = sendCode();
			    	System.out.println("Mailinize gönderilen kod: "+systemCode);
			    	Thread.sleep(500);
					System.out.print("Lütfen kaydinizin yapilabilmesi için mailinize gelen kodu giriniz: ");
					int codeControl = input.nextInt();
					
					if(codeControl == systemCode) {
						userDao.add(user);
						System.out.println("Kayit islemi Tamamlandi => "+user.getFirstName()+" "+user.getLastName());
						System.out.println(".............................................................................");
					}
					else {
						System.out.println("Yanlis Dogrulama kodu girildi!");
					}

			}
			else {
					System.out.println("Hata alindi");
			}
		
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

	@Override
	public boolean login( String email, String password) {
		
		if(!email.isEmpty() && !password.isEmpty()) {
			for(User user: userDao.getAll()) {
				if(email.equals(user.getEmail()) && password.equals(user.getPassword())) {
					System.out.println("Giris Basarili! : "+email);
					return true;
				}
			}
			System.out.println("Giris Basarisiz! : "+email);
			return false;
		}
		
		return false;
		
	}
	
	public boolean isValidEmail(String email) {
		String emailRegex = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
	}
	
	public boolean isExistEmail(String email) {
			
			for(User user: userDao.getAll()) {
				if(user.getEmail().equals(email)) {
					System.out.println("Ayni email adresi sistemde kayitli! : "+email);
					return false;
				}
			}
			return true;
	}
	
	public boolean isExistID(int id) {
		for(User user: userDao.getAll()) {
			if(user.getId() == id) {
				System.out.println("Ayni ID ile kayit olunamaz!");
				return false;
			}
		}
		return true;
	}
	
	public int sendCode() {
		
		int randomCode = (int) (Math.random()*9999);
		
		return randomCode;
	}

}
