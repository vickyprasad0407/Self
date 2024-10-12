
public class PrintUniqueWithoutusingCollection {

	public static void main(String[] args) {
		String s= "school";
		String op="";
		for(int i=0;i<s.length();i++)
		{
			char ch1=s.charAt(i);
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				char ch2=s.charAt(j);
				if(ch1==ch2 && i>j)
					break;

				if(ch1==ch2)
					count++;
			}
			if(count>0) //if 
			{
			System.out.println(ch1+" "+count);
			op=op+ch1;
			}
			
		}
		System.out.println(op);
	}

}
