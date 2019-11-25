package numbers;

import java.util.Scanner;

public class IncreasingOrderOfGivenNumber {

	public static void main(String[] args)
	{
		int num;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		num=sc.nextInt();
		int currDigit=num%10;
		num=num/10;
		while(num>0)
		{
			if(currDigit<=num%10)
			{
				flag=true;
				break;
			}
			currDigit=num%10;
			num=num/10;
		}
		if(flag)
		{
			System.out.println("Digits are not in Increasing order :(");
		}
		else
		{
			System.out.println("Digits are in Increasing order :) ");
		}
	}

}
