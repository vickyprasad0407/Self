import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConsecutiveNoAdditionUsingHashMap {

	public static void main(String[] args) {

		int [] arr= {4,8,2,1};
		int sum=6;
		HashMap< Integer, Integer> hs=new HashMap<Integer, Integer>();
	    for (int i = 0; i < arr.length; i++) {
			int count1 = sum-arr[i];
			int count2=sum+arr[i];
			if(hs.containsKey(count1))
			{ 
				System.out.println(hs.get(count1)+","+i);
			}
			if(hs.containsKey(count2))
			{ 
				System.out.println(hs.get(count2)+","+i);
			}
			
			hs.put(arr[i],i);
		}	
	}

}
