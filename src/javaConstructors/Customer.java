package javaConstructors;

public class Customer
{
  //fields
	private float customerId;
	private String customerName;
	private String customerContactNo;
	private String customerAddress;
	
	public Customer() {

}
   public Customer(float customerId,String customerName,String customerContactNo,String customerAddress)
   {
	   this.customerId = customerId;
	   this.customerName = customerName;
	   this.customerContactNo = customerContactNo;
	   this.customerAddress = customerAddress;
   }
   
   //methods
   public void CustomerDetails()
   {
	   System.out.println(customerId); 
	   System.out.println(customerName); 
	   System.out.println(customerContactNo); 
	   System.out.println(customerAddress); 
   }
}  