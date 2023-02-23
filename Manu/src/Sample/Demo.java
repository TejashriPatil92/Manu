package Sample;

public class Demo 
{
	public static void main(String[] args) 
	{
		int orgnum=153;
		int sum=0;
		
		for(int i=orgnum;i>0;i=i/10)
		{
		
			int rem= i% 10;
			sum=sum+(rem*rem*rem);
			
		}
		if(orgnum==sum)
		{
			System.out.println("given num"+153+" is ormtrongnum");
		}
		else
		{
			System.out.println("given num"+153+"is ormtrongnum");
		}
		
	}
	}


