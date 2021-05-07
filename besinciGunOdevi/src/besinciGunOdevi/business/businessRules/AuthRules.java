package besinciGunOdevi.business.businessRules;

import besinciGunOdevi.entities.concretes.User;

public class AuthRules {
	
	public static boolean checkUserForLogin(User user) {
		if(user.isVerified() && !(user.getEmail().isBlank() && user.getEmail() == null) && 
				!(user.getPassword().isBlank() && user.getPassword() == null) ) {
			return true;
		}
		return false;
	}
}
