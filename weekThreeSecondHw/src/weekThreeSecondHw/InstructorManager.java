package weekThreeSecondHw;

public class InstructorManager extends UserManager{
	
	public void Add(Instructor instructor) {
		System.out.println("sisteme eklendi"+instructor.getFirstName()+instructor.getLastName());
	}

}
