package numbers;

import java.util.Scanner;

public class Move_first_half_to_second_and_second_half_to_first {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to move First half to 2nd Half");
		String str=sc.nextLine();
		sc.close();
		char ch[] = str.toCharArray();
		int i,j;
		for(i=(ch.length)/2;i<=ch.length-1;i++)
		{
			System.out.print(ch[i]);
		}
		for(j=0;j<=(ch.length-1)/2;j++)
		{
			System.out.print(ch[j]);
		}
	}

}
