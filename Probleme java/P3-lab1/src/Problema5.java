import java.util.Arrays;
import java.util.Random;
public class Problema5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
		int[] a=new int[n];
		Random rand=new Random();
		for(int i=0;i<n;i++) {
			a[i]=rand.nextInt(1000);
		}
			
	System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	int x=rand.nextInt(10);
	System.out.println(x);
	
	boolean flag=false;
	for(int i: a)
	{
		if(i==x)
			flag=true;
	}
	System.out.println(flag);
	int s = rand.nextInt(a.length);
	int e = rand.nextInt(a.length -1 ) +1 ;
	if(s > e) {
		s = s+e;
		e = s-e;
		s = s-e;
	}
	
	int[] b = Arrays.copyOfRange(a, s, e);
	System.out.println(s);
	System.out.println(e);
	System.out.println(Arrays.toString(b));
	

	}

}
