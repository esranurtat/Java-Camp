package weekThreeSecondHw;

public class Main {

	public static void main(String[] args) {

		UserManager userManager=new UserManager();
		InstructorManager instructorManager=new InstructorManager();
		StudentManager studentManager=new StudentManager();
		
		Student student=new Student();
		User user=new User();
		Instructor instructor=new Instructor();
		
		student.setFirstName("esra");
		student.setLastName("tat");
		student.setEmail("xxxxxxxxxxx@xxxxx.com");
		student.setPassword("sifre");
		student.setMyCourses("java");
		
		instructor.setFirstName("engin");
		instructor.setLastName("demiroğ");
		instructor.setEmail("yyyyyy@yy.com");
		instructor.setPassword("siifree");
		
		studentManager.AddCourse(student);
		instructorManager.Add(instructor);
		userManager.logIn(student);
		userManager.logIn(instructor);
		
	}

}
