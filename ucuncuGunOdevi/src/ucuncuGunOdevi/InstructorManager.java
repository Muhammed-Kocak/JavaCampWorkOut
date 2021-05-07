package ucuncuGunOdevi;

import ucuncuGunOdevi.Abstract.InstructorService;
import ucuncuGunOdevi.Concrete.Instructor;

public class InstructorManager implements InstructorService{

	public void add(Instructor instructor) {
		
		System.out.println("Ýd'si: " + instructor.getId());
		System.out.println("Tam Ýsmi: " + instructor.getFirstName() + " " + instructor.getLastName());
		System.out.println("Bilgileri ve Sertifikalarý: " + instructor.getAbility());
		System.out.println("Ekleme Baþarýlý!");
		System.out.println("Eðitmen Eklendi");
		System.out.println("---------------------------");
	}

}
