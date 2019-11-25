package numbers;

public class Palindrome {

	public static void main(String[] args) 
	{
		int n = 343;
		int rev=0,original=n,digit;
		while(n!=0)
		{
			digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		if(original==rev)
		System.out.println("The given number is Palindrome: " + original);
		else
			System.out.println("The number is not Palindrome: " + original);
		
		
	}

}
