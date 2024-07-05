package javaConstructors;

public class TestStudentClass {

	public static void main(String[] args) 
	{
		
		
		Department d1 = new Department(101, "HR");
		d1.studentDeparmentDetails();
		
		System.out.println();
		
		Department d2 = new Department(103, "Development"); 
		d2.studentDeparmentDetails();		
		
	}

}
