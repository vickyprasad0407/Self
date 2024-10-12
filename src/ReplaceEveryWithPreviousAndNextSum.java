import java.util.Arrays;
import java.util.HashMap;

public class ReplaceEveryWithPreviousAndNextSum {

	public static void main(String[] args) {

		int [] arr= {1,2,3,4,5};
		int prev=arr[0];
		arr[0]=arr[0]+arr[1];
		for (int i = 1; i < arr.length-1; i++) {
			int curr=arr[i];
			arr[i]=prev+arr[i+1];
			prev=curr;
		}
		arr[arr.length-1]=arr[arr.length-1]+prev;
	   System.out.println(Arrays.toString(arr));	
	
	}

}
