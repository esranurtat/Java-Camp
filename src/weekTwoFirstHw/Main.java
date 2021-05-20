package weekTwoFirstHw;

public class Main {

	public static void main(String[] args) {

		
		Course course1=new Course(1,"Engin Demiroğ","Yazılım geliştirici yetiştirme kampı","C#+Angular");
		
		Course course2=new Course(2,"Engin Demiroğ","Yazılım geliştirici yetiştirme kampı","Java + React");
		
		Course course3=new Course(3,"Engin Demiroğ","Programlamaya giriş için temel kurs","Java , Python ,C#");
		
		Course[] courses= {course1,course2,course3};
		
		for(Course course:courses) {
			System.out.println(course.id);
			System.out.println(course.name);
			System.out.println(course.instructor);
			System.out.println(course.description);
			
		}
		
		CoursesManager coursesManager=new CoursesManager();
		coursesManager.addCourse(course1);
		coursesManager.nextCourse(course1);
		System.out.println(".........................................");
		
		coursesManager.addCourse(course2);
		coursesManager.nextCourse(course2);
		System.out.println(".........................................");
		
		coursesManager.addCourse(course3);
		coursesManager.nextCourse(course3);
	}

}
