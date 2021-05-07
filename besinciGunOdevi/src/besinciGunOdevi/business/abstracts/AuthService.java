package besinciGunOdevi.business.abstracts;

import besinciGunOdevi.entities.concretes.User;

public interface AuthService {

	void signIn(User user);
	void signWithGoogleService(User user);
	void signUp(User user);
}
