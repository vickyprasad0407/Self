
public class ReverseSentence {

	public static void main(String[] args) {

		String s="My name is  vicky";
		String rev="";
		int length=s.length()-1;
		while(length>=0){
			if(s.charAt(length)!=' ' && length!=0)
			{
				length--;
				continue;
			}
			int l=length+1;
			if(l==1)
				l=0;
			while(l<s.length() && s.charAt(l)!=' ')
			{
				rev=rev+s.charAt(l);
				l++;
			}
			rev=rev+" ";
			length--;
	}
		System.out.println(rev);
}
}
