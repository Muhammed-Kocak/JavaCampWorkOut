package besinciGunOdevi.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import besinciGunOdevi.core.dataAccess.InMemory.IMEntityRepositoryBase;
import besinciGunOdevi.dataAccess.abstracts.UserDao;
import besinciGunOdevi.entities.concretes.User;


public class InMemoryUserDao extends IMEntityRepositoryBase<User> implements UserDao {
	
	private List<User> users;
	
	public InMemoryUserDao(List<User> users) {
		super(users);
		this.users = users;
	}
	
	@Override
	public void update(User user) {
		
		User updatedUser = users.stream().filter(u -> u.getId() == user.getId()).findFirst().get();
		System.out.println(updatedUser.toString());
		
		updatedUser.setId(user.getId());
		updatedUser.setFirstName(user.getFirstName());
		updatedUser.setLastName(user.getLastName());
		updatedUser.setEmail(user.getEmail());
		updatedUser.setPassword(user.getPassword());
		System.out.println( updatedUser.toString()+ " Güncellendi");
	}

	@Override
	public void delete(User user) {
		User upadetedUser = users.stream().filter(u -> u.getId() == user.getId()).findFirst().get();
		users.remove(upadetedUser);
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public User get(int id) {
		return users.stream().filter(u -> u.getId() == id).findFirst().get();
	}


	@Override
	public List<String> getEmails() {
		List<String>  emails = new ArrayList<String>();
		for (User user : users) {
			emails.add(user.getEmail());
		}
		return emails;
	}

	@Override
	public boolean isMailMatch(User user) {
		return getEmails().stream().anyMatch(x -> x == user.getEmail());
	}

	@Override
	public boolean isPasswordMatch(User user) {
		return users.stream().anyMatch(user_ -> user_.getPassword() == user.getPassword());
	}

}
