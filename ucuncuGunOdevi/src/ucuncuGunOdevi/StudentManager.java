package ucuncuGunOdevi;

import ucuncuGunOdevi.Abstract.StudentService;
import ucuncuGunOdevi.Concrete.Student;

public class StudentManager implements StudentService{

	public void add(Student student) {
		
		System.out.println("�d'si: " + student.getId());
		System.out.println("Tam �smi: " + student.getFirstName() + " " + student.getLastName());
		System.out.println("��renci Numaras�: " + student.getStudentNumber());
		System.out.println("Ba�ar�s�: " + student.getGrade());
		System.out.println("Ekleme Ba�ar�l�!");
		System.out.println("��renci Eklendi");
		System.out.println("---------------------------");
	}
}
