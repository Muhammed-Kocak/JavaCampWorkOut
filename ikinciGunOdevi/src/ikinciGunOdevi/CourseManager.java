package ikinciGunOdevi;

public class CourseManager {

	public void add(Course course) {
		System.out.println("---------------------------");
		System.out.println("�d'si: " + course.id);
		System.out.println("Kurs �smi: " + course.courseName);
		System.out.println("Kurs A��klamas�: " + course.courseExplanation);
		System.out.println("Kurs E�itmeni: " + course.instructorName);
		System.out.println("Ba�ar�l�!");
		System.out.println("Kurs Eklendi");
		System.out.println("---------------------------");
	}

	public void addMultiple(Course[] courses) {

		for (Course course : courses) {
			add(course);
		}

	}

}
