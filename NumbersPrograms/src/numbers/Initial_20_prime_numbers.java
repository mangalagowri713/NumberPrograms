package numbers;

import java.util.Scanner;

public class Initial_20_prime_numbers {

	public static void main(String[] args) 
	{
		int i,count,n;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Prime number between 1 to 20 are : ");
		for(int j=2;j<=n;j++)
		{
			count=0;
			for(i=1;i<=j;i++)
			{
				if(j%i==0)
				{
					count++;
				}
			}
			if(count==2)
				System.out.println(j + " ");
		}

	}

}
