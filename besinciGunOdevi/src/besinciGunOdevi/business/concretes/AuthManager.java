package besinciGunOdevi.business.concretes;

import besinciGunOdevi.business.abstracts.AuthService;
import besinciGunOdevi.business.abstracts.UserService;
import besinciGunOdevi.business.businessRules.AuthRules;
import besinciGunOdevi.business.businessRules.UserRules;
import besinciGunOdevi.core.adapters.GoogleServiceAdapter;
import besinciGunOdevi.entities.concretes.User;

public class AuthManager implements AuthService {
	private UserService userService;

	public AuthManager(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void signWithGoogleService(User user) {
		user.setVerified(true);
		if (AuthRules.checkUserForLogin(user)) {
			GoogleServiceAdapter googleApi = new GoogleServiceAdapter();
			googleApi.signIn(user);
			userService.add(user);

			return;
		}
		System.out.println("Doğrulanmamış Hesap");

	}

	@Override
	public void signIn(User user) {
		if (AuthRules.checkUserForLogin(user)) {
			if (UserRules.ifEmailExists(user) && UserRules.ifPasswordExists(user)) {
				System.out.println("Giriş Yapıldı!");
			} else {
				System.out.println("Email veya Şifre uyuşmadı");
			}

			return;
		}
		System.out.println("Doğrulanmamış Hesap");

	}

	@Override
	public void signUp(User user) {
		userService.add(user);
		int random = (int) Math.floor(Math.random() * 9999);
		String dogrulamaKodu = user.getFirstName().substring(0, 1) + "" + user.getId() + ""
				+ user.getLastName().substring(0, 1) + "" + random;
		System.out.println("Doğrulama Kodu: " + dogrulamaKodu);
		user.setVerifyCode(dogrulamaKodu);

	}
	
	public void verify(User user, String code) {
		User verifiedUser = userService.get(user.getId());
		if(verifiedUser.getVerifyCode() == code) {
			verifiedUser.setVerified(true);
			System.out.println("Kod Doğrulandı");
			return;
		}else {
			System.out.println("Doğrulama Kodu Hatalı");
		}
	}
}
