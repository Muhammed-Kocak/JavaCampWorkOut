package besinciGunOdevi.core.ioc;

import java.util.List;

import besinciGunOdevi.business.concretes.AuthManager;
import besinciGunOdevi.business.concretes.UserManager;
import besinciGunOdevi.dataAccess.abstracts.UserDao;
import besinciGunOdevi.dataAccess.concretes.InMemoryUserDao;
import besinciGunOdevi.entities.concretes.User;

public class FakeFactoryIOC {

	protected static AuthManager authManager;
	protected static UserManager userManager;
	protected static User user;
	
	public static AuthManager createAuthManager(List<User> users) {
		authManager = new AuthManager(new UserManager(new InMemoryUserDao(
				users)));
		return authManager;
	}
	
	public static UserManager createUserManager(UserDao userDao) {
		userManager = new UserManager(userDao);
		return userManager;
	}
}
