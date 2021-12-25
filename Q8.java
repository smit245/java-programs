/* create a class “Vehicle” with instance variable vehicle_type. Inherit the class in a class called “Car” with instance model_type
, company name etc. display the  information of the vehicle by defining the display() in both super and sub class [ Method Overriding] */

class Vehicle//parent or Base class
{
	private String vcletype;
	
	public Vehicle(String vcletype){
		this.vcletype=vcletype;
	}
	public void display()
	{
		System.out.println(vcletype);
	}	
}

class Car extends Vehicle // inheriting the Vehicle class which is parent and Car is a child or derived.
{
	private String modeltype,cname;
	
	public Car(String modeltype,String cname,String vcletype){
		super(vcletype);//calling super class constructor which must be the first line if not then it will call the default constructor if you have made otherwise will give an error.
		this.modeltype=modeltype;
		this.cname=cname;
	}
	public void display() //overriding method
	{
		super.display(); //calling parent class display method
		System.out.println(modeltype + "  "+ this.cname);	
	}
}


public class Q8 //demo class
{
	public static void main(String ar[])
	{
		Car c=new Car("ACCESS 125","HERO","2 WHEELER");
		c.display();
	}
}
