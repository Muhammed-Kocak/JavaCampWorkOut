package besinciGunOdevi.business.concretes;

import java.util.List;

import besinciGunOdevi.business.abstracts.UserService;
import besinciGunOdevi.business.businessRules.UserRules;
import besinciGunOdevi.dataAccess.abstracts.UserDao;
import besinciGunOdevi.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;

	public UserManager(UserDao useDao) {
		this.userDao = useDao;
		new UserRules(userDao);

	}

	@Override
	public void add(User user) {
		if (UserRules.ifEmailExists(user) && UserRules.ifPasswordExists(user)) {
			userDao.add(user);
			return;
		}

	}

	@Override
	public void update(User user) {
		if (UserRules.ifEmailExists(user) && UserRules.ifPasswordExists(user)) {
			userDao.update(user);
			return;
		}
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	@Override
	public User get(int id) {
		return userDao.get(id);
	}

	protected boolean isValid(User user) {
		return UserRules.isValid(user);
	}
}
