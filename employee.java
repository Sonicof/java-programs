import java.util.*;
public class employee
{
	String emp_name;
	int emp_id;
	double sal,da,hra,pf,gross,net;
	void input()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter employee name : ");
		emp_name=in.nextLine();
		System.out.println("Enter the employee id : ");
		emp_id=in.nextInt();
		System.out.println("Enter the basic salary : ");
		sal=in.nextDouble();
	}
	void calculate()
	{
		da=sal*97/100;
		hra=sal*10/100;
		pf=sal*12/100;
		gross=sal+da+hra+pf;
		net=gross-pf;
	}
	void display()
	{
		System.out.println("The name of employee is : "+emp_name);
		System.out.println("The employee id  is : "+emp_id);
		System.out.println("The gross salary is : "+gross);
		System.out.println("The net salary is : "+net);
	}
	public static void main(String args[])
	{
		employee ob=new employee();
		ob.input();
		ob.calculate();
		ob.display();
	}
}

		
