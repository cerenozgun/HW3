package odev3;

public class InstructorManager extends UserManager {
	
public void viewGivenCourses(Instructor instructor) {
	System.out.println( instructor.getGivenCourses() + instructor.getUserName()+ " taraf�ndan verilen derslerdir.");
	
}

}
