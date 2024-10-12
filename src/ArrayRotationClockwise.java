import java.util.Arrays;

public class ArrayRotationClockwise {

	public static void main(String[] args) {

		int [] arr= {1,2,3,4,5};
		int key=16;
		key=key%arr.length;
		for(int i=1;i<=key;i++)
		{
			int temp=0;
			for(int j=arr.length-1;j>0;j--)
			{
				temp=arr[arr.length-1];
				arr[arr.length-1]=arr[j-1];
				arr[j-1]=temp;
				System.out.println(Arrays.toString(arr));
			}
			
		}
	    
	
	}

}
