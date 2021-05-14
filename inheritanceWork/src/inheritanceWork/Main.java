package inheritanceWork;

public class Main {

	public static void main(String[] args) {
		
		Instructor engin = new Instructor();
		engin.id = 1;
		engin.firstName = "Engin";
		engin.lastName = "Demirog";
		engin.mail = "engindemirog@gmail.com";
		engin.password = "**********";
		engin.biography = "Merhaba ben Engin.";
		engin.certificate = "MCT, PMP, ITIL";
		
		String javaReact = "Java+React";
		String csharpAngular = "C#+Angular";
		String programBasics = "Programlamaya Giris";
		
		String[] courses = {javaReact, csharpAngular, programBasics};
		engin.courses = courses;
		
		
		 
		Student furkan = new Student();
		furkan.id = 2;
		furkan.firstName = "Furkan";
		furkan.lastName = "Yurdal";
		furkan.mail = "f.yurdal@hotmail.com";
		furkan.password = "********";
		
		UserManager userManager = new UserManager();
		userManager.add(furkan);
		userManager.add(engin);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(engin, javaReact);
		instructorManager.addCourse(engin, csharpAngular);
		instructorManager.addCourse(engin, programBasics);
		
		StudentManager studentManager = new StudentManager();
		studentManager.registerToCourse(furkan, javaReact);
		studentManager.registerToCourse(furkan, csharpAngular);
		studentManager.registerToCourse(furkan, programBasics);
		
		}

}
