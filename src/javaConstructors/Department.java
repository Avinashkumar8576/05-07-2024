package javaConstructors;

public class Department 
{
	
	//fields
	private int departmentId;
	private String departmentName;
	
	//constructors: default/zero-parameterized
	public Department()
	{
		
	}
	
	public Department(int departmentId, String departmentName)
	{
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	
	//methods
	public void studentDeparmentDetails()
	{
		System.out.println(departmentId);
		System.out.println(departmentName);
	}
	

}
