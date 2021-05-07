package ucuncuGunOdevi;

import ucuncuGunOdevi.Abstract.InstructorService;
import ucuncuGunOdevi.Abstract.StudentService;
import ucuncuGunOdevi.Concrete.Instructor;
import ucuncuGunOdevi.Concrete.Student;

public class Main {

	public static void main(String[] args) {
		Student muhammed = new Student(1,"Muhammed","Ko�ak","�yi Derece","3415");
		Student ali = new Student(2,"Ali","Ge�ener","�yi Derece","3416");
		Student serhat = new Student(3,"Serhat","Kedek","�yi Derece","3417");
		Student osman = new Student(4,"Osman","Keklik","�yi Derece","3418");
		
		Instructor engin = new Instructor(1,
				"Engin",
				"Demiro�",
				"MCT, PMP, ITIL SERT�F�KASYONLARI"
				);
		
		StudentService studentService = new StudentManager();

		System.out.println("��renci ekleme..");
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		
		studentService.add(serhat);
		studentService.add(muhammed);
		studentService.add(ali);
		studentService.add(osman);
		
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		System.out.println("��retmen ekleme..");
		
		InstructorService instructorService = new InstructorManager();
		
		instructorService.add(engin);
		
	}
}
