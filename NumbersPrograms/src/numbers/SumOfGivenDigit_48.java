package numbers;

import java.util.Scanner;

public class SumOfGivenDigit_48 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		//sc.close();
		while(num/10!=0)
		{
			int sum=0;
			int x=num%10;
			int y=num/10;
			sum=sum+x+y;
			num=sum;
			
		}
		System.out.println(num);
				

	}

}
