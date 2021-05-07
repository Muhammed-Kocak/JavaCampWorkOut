package besinciGunOdevi.services.googleService;

import besinciGunOdevi.entities.concretes.User;

public class GoogleAuthManager {

	public void singIn(User user) {
		System.out.println("Baþarýlý! "+"Google ile giriþ yapýldý.");
		System.out.println("Giriþ yapan kullanýcý: " + user.getEmail());
	}
}
