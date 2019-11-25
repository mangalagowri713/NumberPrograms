package numbers;

public class FibonacciSeries_100_1000 {

	public static void main(String[] args) 
	{
		int n1=100,n2=101,num=0;
		System.out.println(n1 + " " + n2 + " ");
		for(int i=100;i<1000;i++)
		{
			num=n1+n2;
			n1=n2;
			n2=num;
			
			System.out.println(num + " ");
			
		}
	}

}
