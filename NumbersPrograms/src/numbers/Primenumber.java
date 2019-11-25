package numbers;

public class Primenumber {

	public static void main(String[] args)
	{
		int num=3;
		boolean flag=false;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println("The given number " + num + " is prime ");
		else
			System.out.println("The given number " + num + " is not prime");
	}
	

}
