package numbers;

public class PrintOddNumbers {

	public static void main(String[] args)
	{
		int a[] = {2,3,7,4,56,87};
		System.out.print("The odd numbers are:\n");
		for(int i=1;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				
				System.out.println( a[i]);
			}
		}

	}

}
