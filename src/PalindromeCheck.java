
public class PalindromeCheck {

	public static void main(String[] args) {

		String s="momdadisasaoaao";
		String str="";
		StringBuffer sb;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				str=s.substring(i, j);
				if(str.length()>=2)
				{
					sb=new StringBuffer(str);
					sb.reverse();
					if(sb.toString().compareTo(str)==0)
						System.out.println(str);
				}
			}
		}
	
	}

}
