class person
{
	String name;
	int age;
	person(int age,String name)
	{
		this.name=name;
		this.age=age;
	}
}
class Employee extends person
{
	int emp_id;
	int emp_salary;
	Employee(int id,String name,int age,int salary)
	{
		super(age,name);
		emp_id=id;
		emp_salary=salary;
	}
	void printEmployeeDetails()
	{
		System.out.println("Employee ID : "+emp_id);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Age : "+age);
		System.out.println("Employee Salary : "+emp_salary);
	}
}
public class Employee_detail
{
	public static void main(String[] args)
	{
		Employee emp=new Employee(161,"Rashmi",32,45000);
		emp.printEmployeeDetails();
	}
}

