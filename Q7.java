/*simple program to demo initializer block and static initializer block also constructor taking a parameter of it's own class type which is copy constructor*/
class Rectangle{
	private int length;
	private int width;
	private int area;
	static int count;
	static{
		count=0;
	}
	{
		count++;
	}
	public Rectangle(){
	    length=0;
	    width=0;
	}
	public Rectangle(int length,int width){
		this.length=length;
		this.width=width;
	}
	public Rectangle(Rectangle r){
		this.length=r.length;
		this.width=r.width;

	}
	public void area(){
		area=length * width;
	}
	public void display(){
		System.out.println("length= "+length);
		System.out.println("width= "+width);
		System.out.println("Area= "+area);
		System.out.println("count= "+count);
	}
}

public class Q7{
	public static void main(String a[]){


		//PARAMETRIZED CONSTRUCTOR
		Rectangle r= new Rectangle(10,20);
		r.area();
		r.display();

		//COPY CONSTRUCTOR
		Rectangle r2= new Rectangle(r);
		r2.area();
		r2.display();

		//DEFAULT CONSTRUCTOR
		Rectangle r3= new Rectangle();
		r3.area();
		r3.display();
	}
}
