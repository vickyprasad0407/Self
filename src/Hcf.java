
public class Hcf 
{
	public static void main(String[] args) 
	{
		int m=9;
		int n=15;
		while(m%n!=0)
		{
			if(m<n)
			{
				int temp=m;
				m=n;
				n=temp; 
			}
			
			int x=m%n;
			m=n;
			n=x;
		}
		System.out.println(n);
	}
}
