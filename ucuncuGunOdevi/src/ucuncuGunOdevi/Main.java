package ucuncuGunOdevi;

import ucuncuGunOdevi.Abstract.InstructorService;
import ucuncuGunOdevi.Abstract.StudentService;
import ucuncuGunOdevi.Concrete.Instructor;
import ucuncuGunOdevi.Concrete.Student;

public class Main {

	public static void main(String[] args) {
		Student muhammed = new Student(1,"Muhammed","Koçak","Ýyi Derece","3415");
		Student ali = new Student(2,"Ali","Geçener","Ýyi Derece","3416");
		Student serhat = new Student(3,"Serhat","Kedek","Ýyi Derece","3417");
		Student osman = new Student(4,"Osman","Keklik","Ýyi Derece","3418");
		
		Instructor engin = new Instructor(1,
				"Engin",
				"Demiroð",
				"MCT, PMP, ITIL SERTÝFÝKASYONLARI"
				);
		
		StudentService studentService = new StudentManager();

		System.out.println("Öðrenci ekleme..");
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		
		studentService.add(serhat);
		studentService.add(muhammed);
		studentService.add(ali);
		studentService.add(osman);
		
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		System.out.println("Öðretmen ekleme..");
		
		InstructorService instructorService = new InstructorManager();
		
		instructorService.add(engin);
		
	}
}
