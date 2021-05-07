package besinciGunOdevi.utils;

import java.util.ArrayList;
import java.util.List;

import besinciGunOdevi.business.concretes.AuthManager;
import besinciGunOdevi.core.ioc.FakeFactoryIOC;
import besinciGunOdevi.entities.concretes.User;

public class AuthUtil {

	static List<User> users = new ArrayList<User>();
	static User user3 = new User(1, "Muhammed", "Koçak", "muhammed_kocak26@hotmail.com", "birdendokuzakadar");
	static User user2 = new User(2, "Deniz", "Koçak", "deniz_kocak26@hotmail.com", "dokuzdanbirekadar");
	
	public static void create() {
		users.clear();
		users.add(user3);
		users.add(user2);
		AuthManager authManager = FakeFactoryIOC.createAuthManager(users);
		System.out.println("-----------------Sisteme Kayýt-----------------");
		authManager.signUp(user3);
		System.out.println("+-+-+-+-+-+-+-+");
		authManager.signUp(user2);

		System.out.println();
		System.out.println("-----------------Sisteme Giriþ-----------------");
		authManager.signIn(user2);
		System.out.println("+-+-+-+-+-+-+-+");
		authManager.signIn(user3);

		System.out.println();
		System.out.println("-----------------Sisteme Google Servisi Ýle Giriþ-----------------");
		authManager.signWithGoogleService(user2);
		System.out.println("+-+-+-+-+-+-+-+");
		authManager.signWithGoogleService(user3);

		System.out.println();
		System.out.println("-----------------Doðrulama Kodu Kontrolü-----------------");
		authManager.verify(user2, user2.getVerifyCode());
		System.out.println("+-+-+-+-+-+-+-+");
		authManager.verify(user3, user2.getVerifyCode());

		System.out.println();
		System.out.println("-----------------Doðrulama Kodu Kontrolünden Sonra Giriþ-----------------");
		authManager.signIn(user2);
		System.out.println("+-+-+-+-+-+-+-+");
		authManager.signIn(user3);
	}
}
