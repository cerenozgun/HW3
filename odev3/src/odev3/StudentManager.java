package odev3;

public class StudentManager extends UserManager{
	
 public void viewTakenCourse(Student student) {
	 System.out.println( "Aldığınız ders içeriği:" +student.getTakenCourse() );
 }

}
