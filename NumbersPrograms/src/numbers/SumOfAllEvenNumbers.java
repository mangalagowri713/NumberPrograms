package numbers;

import java.util.Scanner;

public class SumOfAllEvenNumbers {

	public static void main(String[] args)
	{
		int num,i,evensum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				evensum=evensum+i;
			}
		}
		System.out.println("the sum of even numbers are : " + evensum );
		
	}

}
