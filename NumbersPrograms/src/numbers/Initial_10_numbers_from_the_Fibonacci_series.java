package numbers;

public class Initial_10_numbers_from_the_Fibonacci_series {

	public static void main(String[] args) 
	{
		int n1=0,n2=10,num=0;
		System.out.println(n1 + " " + n2 + " ");
		for(int i=0;i<10;i++)
		{
			num=n1+n2;
			n1=n2;
			n2=num;
			
			System.out.println(num + " ");
			
		}
	}

}
