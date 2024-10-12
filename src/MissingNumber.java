import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {

     /* String s="159";
       for (int i = 0; i < s.length()-1; i++) {
		String st1=s.charAt(i)+"";
		String st2=s.charAt(i+1)+"";
		int a=Integer.parseInt(st1);
		int b=Integer.parseInt(st2);
		while(a<b-1)
		{
			System.out.print(++a);
		}
		System.out.println();
		}
	*/
        int [] a= {1,5};
         TreeSet<Integer> t=new TreeSet<Integer>();
         for (int i = 0; i < a.length; i++) {
			t.add(a[i]);
		}
         for (int i = t.first(); i < t.last(); i++) {
			if(!t.contains(i))
			{
				System.out.println(i);
			}
		}
	}
		
	}


