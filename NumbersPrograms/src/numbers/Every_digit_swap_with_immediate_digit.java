package numbers;

import java.util.Scanner;

public class Every_digit_swap_with_immediate_digit {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Every Digit Swap with Immediate Digit ");
		String str = sc.nextLine();
		sc.close();
		char ch[]= str.toCharArray();
		int i,j;
		for(i=0;i<ch.length-1;i=i+2)
		{
			if(i%2==0)
			{
				j=i+1;
				char temp = ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
		}
		for(int k=0;k<ch.length;k++)
		{
			System.out.print(ch[k]);
		}
			
			
	}

}
