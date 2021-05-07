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
		System.out.println("Baþarýlý Kullanýcý eklendi!" + entity.toString());
	}

// Bu kýsýmda nasýl yapacaðýmý tam bilemedim bir þeyler denedim :)
// Ama User'a sabitlemek yanlýþ generic yapýdan çekemedim umarým bulurum yakýnda
// Þimdilik add harici metotlarý ýnmemoryuserdaoya taþýyorum.
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
//		System.out.println("Kullanýcý Güncellendi.");
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
