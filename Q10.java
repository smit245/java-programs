/*
    describe abstract class called shape 
    make three subclass say triangle rectangle and circle.
    define one method area() in the abstract class 
    override this area() in these three subclass to calculate for specific object.
    i.e. area() of triangle subclass should calculate area of triangle etc. same for rectangle and circle. 
*/
abstract class Shape{
    protected double val1,val2;
    public Shape(){
        val1=0;
        val2=0;
    }
    public Shape(double val1,double val2){
        this.val1=val1; 
        this.val2=val2;  
    }
    public Shape(double val1){
        this.val1=val1;
    }
    abstract double area();
}
class Triangle extends Shape{
    public Triangle(double val1,double val2){
        super(val1,val2);   
    }
    double area(){
        return (val1*val2)/2;
    }
}

class Rectangle extends Shape{
    public Rectangle(double val1,double val2){
        super(val1,val2);   
    }
    double area(){  
        return val1*val2;
    }
}

class Circle extends Shape{
    public Circle(double val1){
        super(val1);   
    }
    double area(){
        return (3.14*val1*val1);
    }
}

public class Q10{
    public static void main(String a[]){

        //Circle area.
        Circle c=new Circle(5.5);
        System.out.println("Circle area is:- "+c.area());

        //Triangle area.
        Triangle t=new Triangle(10.2,15.5);
        System.out.println("Triangle area is:- "+t.area());

        //Rectangle area.
        Rectangle r=new Rectangle(10.2,15.5);
        System.out.println("Rectangle area is:- "+r.area());  
    }
}
