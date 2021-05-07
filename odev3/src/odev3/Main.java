package odev3;



public class Main {

	public static void main(String[] args) {
		Student student = new Student ();
		student.setUserName("ceren ");
		student.setPassword("123452");
		student.setNationalIdentity("365874");  
		student.setTakenCourse("Java");
		
		
		Instructor instructor = new Instructor ();
		instructor.setUserName("özgün ");
		instructor.setPassword("895623");
		instructor.setNationalIdentity("745896");
		instructor.setGivenCourses("Java and C#");
		
		UserManager userManager = new UserManager ();
		
		User [] users = {student,instructor};
		
		
		userManager.addMultiple(users);
		
		
		StudentManager studentManager = new StudentManager ();
		studentManager.viewTakenCourse(student);
		studentManager.add(student);
		studentManager.remove(student);


	InstructorManager instructormanager = new InstructorManager();
	instructormanager.viewGivenCourses(instructor);
	instructormanager.add(instructor);
	instructormanager.remove(instructor);
}
}
	
