package numbers;

import java.util.Scanner;

public class Reverse_2nd_Half_47 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("reverse only 2nd Half ");
		String s = sc.nextLine();
		sc.close();
		char ch[] = s.toCharArray();
		int i, j ;
		for(i=0;i<=(ch.length-1)/2;i++)
		{
			System.out.print(ch[i]);
		}
		for(j=ch.length-1;j>(ch.length-1)/2;j--)
		{
			System.out.print(ch[j]);
		}

	}

}
