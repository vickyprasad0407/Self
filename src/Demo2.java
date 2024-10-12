
public class Demo2 {

	public static void main(String[] args) {

		String s="mom dad child";
		String sp []=s.split(" ");
		for (int i = 0; i < sp.length; i++) {
			String st=sp[i];
			int j=0,k=st.length()-1;
			boolean flag=true;
			while(k>j)
			{
				char ch1=st.charAt(j++);
				char ch2=st.charAt(k--);
				if(ch1!=ch2)
				{
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.print(st+" ");
		}
	}

}
