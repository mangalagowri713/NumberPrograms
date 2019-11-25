package numbers;

public class initial3Armstrongnumbers {

	public static void main(String[] args) 
	{
		int n,limit=1,temp,total=0;
		System.out.println("Initial 3 Armstrong number from 10 : ");
		for(int i=10;limit<=3;i++)
		{
			
		
		n=i;
		while(n!=0)
		{
			temp=n%10;
			total=total+temp*temp*temp;
			n/=10;
		}
		if(total==i)
		{
			System.out.println(i + " ");
			limit++;
		}
		total=0;

	}

}
}
