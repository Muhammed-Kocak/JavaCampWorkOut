package ucuncuGunOdevi.Concrete;

public class Student extends User {

	String grade;
	String studentNumber;

	public Student(int id, String firstName, String lastName) {
		super(id, firstName, lastName);
	}
	
	public Student(int id, String firstName, String lastName, String grade, String studentNumber) {
		super(id, firstName, lastName);
		this.grade = grade;
		this.studentNumber = studentNumber;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

}
