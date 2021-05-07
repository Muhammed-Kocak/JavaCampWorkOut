package besinciGunOdevi.business.businessRules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import besinciGunOdevi.dataAccess.abstracts.UserDao;
import besinciGunOdevi.entities.concretes.User;

public class UserRules {

	private static UserDao userDao;
	
	public UserRules(UserDao userDao) {
		UserRules.userDao = userDao;
	}


	public static boolean ifEmailExists(User user) {
		return userDao.isMailMatch(user);
	}
	
	
	public static boolean ifPasswordExists(User user) {
		
		return userDao.isPasswordMatch(user);
		
	}
	
	public static boolean isValid(User user) {
		String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.getEmail());
        
		if(user.getFirstName() == null || user.getLastName() == null 
				|| user.getEmail() == null || user.getPassword() == null ) {
			System.out.println("Boþ býrakýlamaz");
			return false;
		}
		else {
			if(!matcher.matches()) {
				System.out.println("E Mail Hatalý");
				return false;
			}

			else {
				if(user.getFirstName().length() < 2 && user.getLastName().length() < 2) {
					if(user.getPassword().length() < 6 ) {
						System.out.println("Þifreniz en az 6 haneli olmak zorunda.");
						return false;
					}
				}
				
			}
		}
		return true;
	}
}
