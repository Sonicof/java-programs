abstract class shape
{
	int x,y;
	abstract void area(double x,double y);
}
class Rectangle extends shape
{
	void area(double x,double y)
	{	
		System.out.println("Area of rectangle is  : "+(x*y));
	}
}
class Circle extends shape
{
	void area(double x,double y)
	{	
		System.out.println("Area of circle is  : "+(x*x*3.14));
	}
}
class Triangle extends shape
{
	void area(double x,double y)
	{	
		System.out.println("Area of triangle is  : "+(x*y*0.5));
	}
}
public class abstractdemo
{
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle();
		r.area(2,5);
		Circle c=new Circle();
		c.area(5,5);
		Triangle t=new Triangle();
		t.area(2,5);
	}
}

