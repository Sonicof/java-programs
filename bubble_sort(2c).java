import java.util.*;
class bubble
{
	void bubblesort(int arr[],int size)
	{	
		for(int i=0;i<size;i++)
		{
			for(int j=1;j<size-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String args[])
	{
		int arr[]={32,43,75,33,89,53};
		bubble bs=new bubble();
		bs.bubblesort(arr,arr.length);
		System.out.print("Sorted elements are :  ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

		
	
	
