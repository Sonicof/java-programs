import java.util.*;
class RepeatElement
{
	void printRepeating(int arr[],int size)
	{
		System.out.print("Repeating elements are : ");
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{	
				if(arr[i]==arr[j])
				{	
					System.out.print(arr[j]+" ");
				}
			}
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		RepeatElement repeat=new RepeatElement();
		int arr[]={4,2,4,5,3,1};
		int arr_size=arr.length;
		repeat.printRepeating(arr,arr_size);
	}
}
