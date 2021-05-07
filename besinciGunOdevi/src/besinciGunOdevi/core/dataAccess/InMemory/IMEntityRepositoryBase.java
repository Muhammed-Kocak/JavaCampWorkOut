package besinciGunOdevi.core.dataAccess.InMemory;

import java.util.List;

import besinciGunOdevi.core.dataAccess.EntityRepository;

public class IMEntityRepositoryBase<TEntity> implements EntityRepository<TEntity> {

	private List<TEntity> users;

	public IMEntityRepositoryBase(List<TEntity> users) {
		this.users = users;
	}

	@Override
	public void add(TEntity entity) {
		users.add(entity);
		System.out.println("Ba�ar�l� Kullan�c� eklendi!" + entity.toString());
	}

// Bu k�s�mda nas�l yapaca��m� tam bilemedim bir �eyler denedim :)
// Ama User'a sabitlemek yanl�� generic yap�dan �ekemedim umar�m bulurum yak�nda
// �imdilik add harici metotlar� �nmemoryuserdaoya ta��yorum.
//  @Override
// 	public void update(TEntity entity) {
//		TEntity updatedEntity= users.stream().filter(u -> ((User) u).getId() == ((User) entity).getId()).findFirst().get();
//		System.out.println(updatedEntity.toString());
//
//		((User) updatedEntity).setId(((User) entity).getId());
//		((User) updatedEntity).setFirstName(((User) entity).getFirstName());
//		((User) updatedEntity).setLastName(((User) entity).getLastName());
//		((User) updatedEntity).setEmail(((User) entity).getEmail());
//		((User) updatedEntity).setPassword(((User) entity).getPassword());
//		
//		System.out.println("Kullan�c� G�ncellendi.");
//	}
//
//	@Override
//	public void delete(TEntity user) {
//		TEntity upadetedUser = users.stream().filter(u ->((User) u).getId() == ((User) user).getId()).findFirst().get();
//		users.remove(upadetedUser);
//
//	}
//
//	@Override
//	public List<TEntity> getAll() {
//		return users;
//	}
//
//	@Override
//	public TEntity get(int id) {
//		return users.stream().filter(u -> ((User) u).getId() == id).findFirst().get();
//	}

}
