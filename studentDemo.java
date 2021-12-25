
/* create class student with enrollment no. name and  array of student result class member variables create a parameterized constructor to initialize all members create display method to display all the member

create student result class with sem and array of marks of type int as member variable create a parameterized constructor to initialize all member create display method to display all record create student demo class that has a main method and creates and object of student class and displays its contents	*/

class Student{
	private String en,name;
	private StudentResult[] s;
	
	Student(String e,String n,StudentResult s[])
	{
		en=e;
		name=n;
		this.s=s;
	}
	
	void display()
	{
		System.out.println();
		System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+   ");
		System.out.println();
		
		System.out.println("Enrollment: "+en);
		System.out.println("Name: "+name);
		for(int i=0;i<s.length;i++)
		{
			s[i].display(); //Calling the display function of StudentResult class.
		}
		
	}
}

class StudentResult{
 	int sem;
	int[] marks;
	
	StudentResult(int s,int[] m)
	{
		sem=s;
		marks=m;	
	}
	
	void display()
	{
		System.out.println("Sem: "+sem);
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Marks of Subject "+(i+1)+" : "+marks[i]);
		}
	}
	
}

class studentDemo{
	public static void main(String ar[]){
		StudentResult sr[]=new StudentResult[2];
		sr[0] = new StudentResult(1,new int[]{11,14,27}); //second parameter is an array
		sr[1] = new StudentResult(2,new int[]{13,17,22}); // putting the multiple semester marks
		Student s = new Student("E101","JAADU",sr);
		s.display();
		
		sr=new StudentResult[4];
		sr[0] = new StudentResult(1,new int[]{12,15,28});
		sr[1] = new StudentResult(2,new int[]{14,18,23});
		sr[2] = new StudentResult(3,new int[]{25,50,45});
		sr[3] = new StudentResult(4,new int[]{16,33,30});
		Student s1 = new Student("E102","ROHIT",sr);
		s1.display();
	}
}
