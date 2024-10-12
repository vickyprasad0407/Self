import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccuranceUsingHashMap {

	public static void main(String[] args) {

		String s="baaabbaccbd";
		HashMap<Character, Integer> hs=new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			Character ch=s.charAt(i);
			
			if(hs.containsKey(s.charAt(i)))
			{
				int count=hs.get(s.charAt(i));
				hs.put(s.charAt(i), ++count);
			}
			else
				hs.put(s.charAt(i), 1);
		}
		System.out.println(hs);
			}
}
