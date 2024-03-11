import java.util.*;
public class Fibonacci
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a=0,b=1,i,n,sum=0;
		System.out.println("Enter n : ");
		n=in.nextInt();
		if(n==1)
		{
			System.out.println("The "+n+" term is : "+a);
		}
		else if(n==2)
		{
			System.out.println("The "+n+" term is : "+b);
		}
		else
		{
			System.out.print("The series is : "+a+" "+b+" ");
			for(i=3;i<=n;i++)
			{
				sum=a+b;
				System.out.print(sum+" ");
				a=b;
				b=sum;
			}
			System.out.println();
			System.out.println("The "+n+" term is : "+sum);
		}
	}
}

