package ucuncuGunOdevi.Concrete;

public class Instructor extends User {

	public String ability;

	public Instructor(int id, String firstName, String lastName) {
		super(id, firstName, lastName);
	}
	
	public Instructor(int id, String firstName, String lastName, String ability) {
		super(id, firstName, lastName);
		this.ability = ability;
	}

	public String getAbility() {
		return ability;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}

}
