package javaConstructors;

public class TestCustomerClass {
	
	public static void main(String[]args)
	{
		Customer c1 = new Customer(101,"Avinash kumar","9598503207","Kharadi Pune");
		c1.CustomerDetails();
		
		System.out.println();
		
		Customer c2 = new Customer(501,"Hardik kumar","9080908090","Kharadi Pune");
		c2.CustomerDetails();
		
		 System.out.println(); 
	}
}
