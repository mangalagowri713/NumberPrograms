package numbers;

import java.util.Scanner;

public class Smaller_number {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b)
		{
			if(b>c)
			
				System.out.println(c + "is smaller number");
			
				else 
				
				System.out.println(b + "is smaller number");
			
			
		}
		else
		System.out.println(a + " is smaller number");
		}
		}
	


