package inheritanceWork;

public class InstructorManager extends UserManager {
	public void addCourse(Instructor instructor, String course) {
		System.out.println(instructor.firstName + ", " + course + " kursunu basariyla ekledin.");
	}
}
