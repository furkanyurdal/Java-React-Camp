package inheritanceWork;

public class StudentManager extends UserManager {
	public void addCommand(Student student, String command) {
		System.out.println(student.firstName + ": " + command);
	}
	public void registerToCourse(Student student, String course) {
		System.out.println(student.firstName +", basariyla "+ course +" kursuna kayit oldun.");
	}
}
