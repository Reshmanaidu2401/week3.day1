package org.college;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Student id 1");
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Student Details with id and name");
	}
	
	public void getStudentInfo(String email, int phoneNumber) {
		System.out.println("Student Details with email and Phone number");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students stud=new Students();
		stud.getStudentInfo(10);
		stud.getStudentInfo(12, "Resh");
		stud.getStudentInfo("resh@gmail.com", 12345777);
		
		
		
		
		

	}

}
