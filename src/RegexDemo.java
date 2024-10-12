
public class RegexDemo {

	public static void main(String[] args) {

		String s="aaabbcccdddd";
		int count=1;
		for (int i = 1; i < s.length(); i++) {
			
			if(s.charAt(i)==s.charAt(i-1))
			{
				count++;
			}
			else
			{
				System.out.print(s.charAt(i-1)+""+count);
				count=1;
			}
		}
		System.out.println(s.charAt(s.length()-1)+""+count);
		
	}

}
