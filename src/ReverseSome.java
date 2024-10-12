import java.util.Arrays;

public class ReverseSome {

	public static void main(String[] args) {

    String s="hello,how,are,you";		
	//String op=s.replaceAll(",", " ");
    String op="";
    for(int i=0;i<s.length();i++)
    {
    	if(s.charAt(i)==',')
    		op=op+" ";
    	else
    		op=op+s.charAt(i);
    }
    System.out.println(op);
	}

}
