import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DemoPractice {

	static boolean isAnagram(String a, String b) {
        int count1[]=new int [26];
        for(int i=0;i<a.length();i++)
        {
            int ch=a.charAt(i);
            if(ch>='a' && ch <='z')
              count1[ch-97]++;
            else if(ch>='A' && ch<='Z')
             count1[ch-65]++;
        }
        int count2[]=new int [26];
        for(int i=0;i<b.length();i++)
        {
             int ch=b.charAt(i);
            if(ch>='a' && ch <='z')
              count2[ch-97]++;
            else if(ch>='A' && ch<='Z')
             count2[ch-65]++;
        }
        for(int i=0;i<count1.length;i++)
        {
            if(count1[i]!=count2[i])
            return false;
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
