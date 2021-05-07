package ikinciGunOdevi;

public class CourseManager {

	public void add(Course course) {
		System.out.println("---------------------------");
		System.out.println("Ýd'si: " + course.id);
		System.out.println("Kurs Ýsmi: " + course.courseName);
		System.out.println("Kurs Açýklamasý: " + course.courseExplanation);
		System.out.println("Kurs Eðitmeni: " + course.instructorName);
		System.out.println("Baþarýlý!");
		System.out.println("Kurs Eklendi");
		System.out.println("---------------------------");
	}

	public void addMultiple(Course[] courses) {

		for (Course course : courses) {
			add(course);
		}

	}

}
