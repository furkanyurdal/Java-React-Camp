package oopIntroWork;

public class Main {

	public static void main(String[] args) {
		Educator educator = new Educator(1, "Engin Demiroð", "Merhaba ben Engin Demiroð");
		
		Course course1 = new Course(1, "Programlamaya Giriþ", educator);
		Course course2 = new Course(2, "C#+Angular", educator);
		Course course3 = new Course(3, "Java+React", educator);

		Course[] courses = {course1, course2, course3};
		
		for (Course course : courses) {
			System.out.println(course.name);
		}
	
		CourseManager courseManager = new CourseManager();
		courseManager.registerToCourse(course1);
		courseManager.registerToCourse(course2);
		courseManager.registerToCourse(course3);
		courseManager.completedToCourse(course1);
	}

}
