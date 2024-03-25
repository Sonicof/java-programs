class Person
{
	Person()
	{
		System.out.println("Person Constructor");
	}
	void nationality()
	{
		System.out.println("Indian");
	}
	void place()
	{
		System.out.println("Mumbai");
	}
}
class Emp extends Person
{
	Emp()
	{
		System.out.println("Emp Constructor");
	}
	void organization()
	{
		System.out.println("IBM");
	}
	void place()
	{
		System.out.println("New York");
	}
}
class Manager extends Emp
{
	Manager()
	{
		System.out.println("Manager Constructor");
	}
	void subordinate()
	{
		System.out.println(12);
	}
	void place()
	{
		System.out.println("London");
	}
}
public class check
{
	public static void main(String[] args)
	{
		Manager m=new Manager();
		m.nationality();
		m.organization();
		m.subordinate();
		m.place();
	}
}
