package ucuncuGunOdevi;

import ucuncuGunOdevi.Abstract.StudentService;
import ucuncuGunOdevi.Concrete.Student;

public class StudentManager implements StudentService{

	public void add(Student student) {
		
		System.out.println("Ýd'si: " + student.getId());
		System.out.println("Tam Ýsmi: " + student.getFirstName() + " " + student.getLastName());
		System.out.println("Öðrenci Numarasý: " + student.getStudentNumber());
		System.out.println("Baþarýsý: " + student.getGrade());
		System.out.println("Ekleme Baþarýlý!");
		System.out.println("Öðrenci Eklendi");
		System.out.println("---------------------------");
	}
}
