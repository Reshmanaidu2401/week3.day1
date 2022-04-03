package org.student;

import org.department.Department;

public class Student extends Department {

public void studentName() {
		
		System.out.println("Reshma");
	}
public void studentDept() {
	
	System.out.println("IT");
}
public void studentId() {
	
	System.out.println("12401995");
}

public static void main (String[] args) {
	
	Student stu = new Student();
	stu.studentName();
	stu.studentId();
	stu.studentDept();
	stu.deptName();
    stu.collegeCode();
    stu.collegeName();
    stu.collegeRank();
}

}
