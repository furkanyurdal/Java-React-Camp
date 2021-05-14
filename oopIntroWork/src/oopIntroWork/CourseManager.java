package oopIntroWork;

public class CourseManager {

	public void registerToCourse(Course course) {
		System.out.println("Kayýt oldunuz. : " + course.name);
		
	}
	
	public void completedToCourse(Course course) {
		System.out.println(course.name + " kursunu baþarýyla tamamladýnýz.");
	}
}
