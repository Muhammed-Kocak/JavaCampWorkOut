package ucuncuGunOdevi;

import ucuncuGunOdevi.Abstract.InstructorService;
import ucuncuGunOdevi.Concrete.Instructor;

public class InstructorManager implements InstructorService{

	public void add(Instructor instructor) {
		
		System.out.println("�d'si: " + instructor.getId());
		System.out.println("Tam �smi: " + instructor.getFirstName() + " " + instructor.getLastName());
		System.out.println("Bilgileri ve Sertifikalar�: " + instructor.getAbility());
		System.out.println("Ekleme Ba�ar�l�!");
		System.out.println("E�itmen Eklendi");
		System.out.println("---------------------------");
	}

}
