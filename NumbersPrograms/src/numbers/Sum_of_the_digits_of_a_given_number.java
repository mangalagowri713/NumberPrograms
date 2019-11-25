package numbers;

public class Sum_of_the_digits_of_a_given_number {

	public static void main(String[] args) 
	{
		int n= 123;
		int sum=0;
		int a[]= new int[3];
		for(int i=0;i<a.length;i++)
		{
			sum=sum+n%10;
			n/=10;
		}
		System.out.println("Sum of the all digit number is : " + sum);
	}

}
