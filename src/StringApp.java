
public class StringApp {

	public static void main(String[] args) {

		String s="Apple Appium Application";
	    String [] st=s.split(" ");
	    boolean flag=true;
	    for(int i=0;i<st[0].length();i++)
	    {
	    	String str=st[0].substring(0, i+1);
	    	for (int j = 1; j < st.length; j++) {
				if(!st[j].startsWith(str))
				{
					System.out.println(st[0].substring(0, i));
					flag=false;
					break;
				}
			}
	    	if(flag==false)
	    		break;
	    }
	}

}
