package besinciGunOdevi.dataAccess.abstracts;

import java.util.List;

import besinciGunOdevi.core.dataAccess.EntityRepository;
import besinciGunOdevi.entities.concretes.User;

public interface UserDao extends EntityRepository<User> {
	void update(User user);
	void delete(User user);
	List<User> getAll();
	User get(int id);
	List<String> getEmails();
	boolean isMailMatch(User user);
	boolean isPasswordMatch(User user);
}
