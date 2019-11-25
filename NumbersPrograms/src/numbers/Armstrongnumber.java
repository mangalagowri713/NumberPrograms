package numbers;

public class Armstrongnumber {

	public static void main(String[] args)
	{
		int n=370,num,temp,total=0;
		num=n;
		while(num!=0)
		{
			temp=num%10;
			total=total+temp*temp*temp;
			num/=10;
		}
		if(total==n)
			System.out.println(n + " is an Armstrong number");
		else
			System.out.println(n + " is not an Armstromg number");
	}

}
