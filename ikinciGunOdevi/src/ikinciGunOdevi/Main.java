package ikinciGunOdevi;

public class Main {

	public static void main(String[] args) {
		Course java = new Course(
				1,
				"Nitelikli Yaz�l�mc� Geli�tirme Java Kamp�",
				"Best practice'lerin oldu�u harika kamp",
				"Engin DEM�RO�"
				);
		
		Course cSharp = new Course(
				2,
				"Nitelikli Yaz�l�mc� Geli�tirme C# Kamp�",
				"Best practice'lerin oldu�u best kamp",
				"Engin DEM�RO�"
				);

		
		CourseManager courseManager = new CourseManager();
		
		courseManager.add(cSharp);
		courseManager.add(java);
		
		Course[] courses = {java,cSharp};
		courseManager.addMultiple(courses);
	}

}
