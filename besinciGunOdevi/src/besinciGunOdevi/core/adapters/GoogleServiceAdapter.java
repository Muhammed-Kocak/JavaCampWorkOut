package besinciGunOdevi.core.adapters;

import besinciGunOdevi.entities.concretes.User;
import besinciGunOdevi.services.googleService.GoogleAuthManager;

public class GoogleServiceAdapter {
	public void signIn(User user) {
		GoogleAuthManager googleAuth = new GoogleAuthManager();
		googleAuth.singIn(user);
		
	}
}
