package weekTwoFirstHw;

public class Course {
	
	public Course() {
		System.out.println("ben çalýþtým");
	}
	
	public Course(int id, String instructor, String name, String description) {
		super();
		this.id = id;
		this.instructor = instructor;
		this.name = name;
		this.description = description;
	}

	int id;
	String instructor;
	String name;
	String description;
	


}
