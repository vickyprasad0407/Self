import java.util.*;
import java.io.*;

public class FetchUpperAndLower{
   public static void main(String[] args) {
	
	   String s="dabDhgjB";//db
	   String lower=getLowerCase(s);
	   String upper=getUpperCase(s);
	   String both=getBoth(s);
	   System.out.println(both);
   }
   public static String getBoth(String s)
   {
	   HashSet<Character> hs=new HashSet<Character>();
	   for (int i = 0; i < s.length(); i++) {
		hs.add(s.charAt(i));
	}
	   String both="";
	   for (Character cha : hs) {
		   int ch=cha;
		for (int i = 0; i < s.length(); i++) {
			if(ch==s.charAt(i)+32)
				both=both+s.charAt(i);
		}
	}
	  	   return both;
   }
   public static String getLowerCase(String s)
   {
	   String lower="";
	   for (int i = 0; i < s.length(); i++) {
		char ch=s.charAt(i);
		if(ch>='a' && ch<='z')
			lower=lower+ch;
	}
	   return lower;
   }
   public static String getUpperCase(String s)
   {
	   String upper="";
	   for(int i=0;i<s.length();i++)
	   {
		   char ch=s.charAt(i);
		   if(ch>='A' && ch<='Z')
			   upper=upper+ch;
	   }
	   return upper;
   }

   
}
