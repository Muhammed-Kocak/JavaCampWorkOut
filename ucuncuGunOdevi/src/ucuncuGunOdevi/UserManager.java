package ucuncuGunOdevi;

import ucuncuGunOdevi.Abstract.UserService;
import ucuncuGunOdevi.Concrete.User;

public class UserManager implements UserService {

	public void add(User user) {
		
		System.out.println("Ýd'si: " + user.getId());
		System.out.println("Tam Ýsmi: " + user.getFirstName() + " " + user.getLastName());
		System.out.println("Baþarýlý!");
		System.out.println("Kiþi Eklendi");
		System.out.println("---------------------------");
	}


}
