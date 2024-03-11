import java.util.*;
class common
{
	void printCommon(int arr1[],int arr1size,int arr2[],int arr2size)
	{
	int f=0;
		System.out.print("The common elements are : ");
		for(int i=0;i<arr1size;i++)
		{
			for(int j=0;j<arr2size;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.print(arr1[i]+" ");
					f=1;
				}
			}
		}
		if(f==0)
		{
			System.out.print("No common elements were found");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		int arr1[]={1,2,3,4,5,6,7,8,9,10};
		int arr2[]={1,2,3,4,5};
		common cm=new common();
		cm.printCommon(arr1,arr1.length,arr2,arr2.length);
	}
}

		
