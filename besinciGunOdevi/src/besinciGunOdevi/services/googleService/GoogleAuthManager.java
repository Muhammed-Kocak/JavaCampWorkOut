package besinciGunOdevi.services.googleService;

import besinciGunOdevi.entities.concretes.User;

public class GoogleAuthManager {

	public void singIn(User user) {
		System.out.println("Ba�ar�l�! "+"Google ile giri� yap�ld�.");
		System.out.println("Giri� yapan kullan�c�: " + user.getEmail());
	}
}
