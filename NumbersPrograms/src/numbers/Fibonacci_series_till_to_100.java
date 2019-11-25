package numbers;

public class Fibonacci_series_till_to_100 {

	public static void main(String[] args) 
	{
		int n1=0,n2=100,num=0;
		System.out.println(n1 + " " + n2 + " ");
		for(int i=0;i<100;i++)
		{
			num=n1+n2;
			n1=n2;
			n2=num;
			
			System.out.println(num + " ");
			
		}

	}

}
