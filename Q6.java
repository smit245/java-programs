/*simple demo of object oriented programming*/
class Student{
	private String name,eno,gender;
	private int[] marks;
	private static int count=0;
	Student(){
		this("","","",new int[]{0,0});	
	}
	Student(String eno,String name,String gender,int[] marks){
		this.eno=eno;
		this.name=name;
		this.gender=gender;
		this.marks=marks;
		count++;
	}
	public void display(){
		System.out.println("Enrollment no. -->"+eno);
		System.out.println("Name           -->"+name);
		System.out.println("Gender         -->"+gender);
		for(int mark: marks){
			System.out.println("Marks          -->"+mark);
		}
		System.out.println("Total Students -->"+count);
	}
}
public class Q6{
	public static void main(String a[]){
		Student s= new Student();
		s.display();
		Student s2= new Student("E001","Smit","Male",new int[]{100,90,80});
		s2.display();
	}
}
