package ucuncuGunOdevi;

import ucuncuGunOdevi.Abstract.UserService;
import ucuncuGunOdevi.Concrete.User;

public class UserManager implements UserService {

	public void add(User user) {
		
		System.out.println("�d'si: " + user.getId());
		System.out.println("Tam �smi: " + user.getFirstName() + " " + user.getLastName());
		System.out.println("Ba�ar�l�!");
		System.out.println("Ki�i Eklendi");
		System.out.println("---------------------------");
	}


}
