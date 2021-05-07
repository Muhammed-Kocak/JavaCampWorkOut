package ikinciGunOdevi;

public class Main {

	public static void main(String[] args) {
		Course java = new Course(
				1,
				"Nitelikli Yazılımcı Geliştirme Java Kampı",
				"Best practice'lerin olduğu harika kamp",
				"Engin DEMİROĞ"
				);
		
		Course cSharp = new Course(
				2,
				"Nitelikli Yazılımcı Geliştirme C# Kampı",
				"Best practice'lerin olduğu best kamp",
				"Engin DEMİROĞ"
				);

		
		CourseManager courseManager = new CourseManager();
		
		courseManager.add(cSharp);
		courseManager.add(java);
		
		Course[] courses = {java,cSharp};
		courseManager.addMultiple(courses);
	}

}
