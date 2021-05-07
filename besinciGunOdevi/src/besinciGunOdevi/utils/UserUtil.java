package besinciGunOdevi.utils;

import java.util.ArrayList;
import java.util.List;

import besinciGunOdevi.business.concretes.UserManager;
import besinciGunOdevi.core.ioc.FakeFactoryIOC;
import besinciGunOdevi.dataAccess.concretes.InMemoryUserDao;
import besinciGunOdevi.entities.concretes.User;

public class UserUtil {
	static List<User> users = new ArrayList<User>();
	static User user3 = new User(1, "Muhammed", "Koçak", "muhammed_kocak26@hotmail.com", "birdendokuzakadar");
	static User user2 = new User(2, "Deniz", "Koçak", "deniz_kocak26@hotmail.com", "dokuzdanbirekadar");

	public static void create() {
		users.clear();
		users.add(user2);
		users.add(user3);

		UserManager userManager = FakeFactoryIOC.createUserManager(new InMemoryUserDao(users));

		System.out.println("Add");
		userManager.add(user2);
		userManager.add(user3);
		System.out.println("-------------");

		System.out.println("Delete");
		userManager.delete(user2);
		System.out.println("-------------");

		System.out.println("GetById");
		userManager.get(1);
		System.out.println("-------------");

		System.out.println("GetAll");
		userManager.getAll();
		System.out.println("-------------");

		System.out.println("Update");
		User userNew = new User(2, "Deniz", "Koçak", "deniz_kocak26@hotmail.com", "bunasýlþifre");
		userManager.update(userNew);
	}
}
