package ikinciGunOdevi;

public class Course {
	int id;
	String courseName;
	String courseExplanation;
	String instructorName;
	
	public Course() {
		System.out.println("Harikasýn!");
	}
	
	public Course(int id,String courseName,String courseExplanation,String instructorName) {
		this();
		this.id= id;
		this.courseName = courseName;
		this.courseExplanation = courseExplanation;
		this.instructorName = instructorName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseExplanation() {
		return courseExplanation;
	}

	public void setCourseExplanation(String courseExplanation) {
		this.courseExplanation = courseExplanation;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
}
