import java.util.Arrays;

public class ArrayRotationAntiClockwise {

	public static void main(String[] args) {

		int [] arr= {1,2,3,4,5};
		int key=16;
		key=key%arr.length;
		for (int i = 1; i <=key; i++) {
			int temp=0;
			int a=arr.length-1;
			int b=arr.length-2;
			while(a>0)
			{
				temp=arr[a];
				arr[a--]=arr[b];
				arr[b--]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
