package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name is: Selvam");
		
	}
	public void studentDept() {
		System.out.println("Student Department is Mathematics and CA");
		
	}
	public void studentId() {
		System.out.println("Student ID is: 2009MA35");
		
	}
public static void main(String[] args) {
	Student sel = new Student();
	sel.collegeName();
	sel.collegeCode();
	sel.collegeRank();
	sel.departmentName();
	sel.studentName();
	sel.studentDept();
	sel.studentId();
		
	}

}
