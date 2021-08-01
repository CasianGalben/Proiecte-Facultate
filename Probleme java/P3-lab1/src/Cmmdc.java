
public class Cmmdc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
	    int b=Integer.parseInt(args[1]);
	    System.out.println(cmmdc(a,b));
  
	}
	public static int cmmdc(int x,int y) {
		if(y==0)
			return x;
		
		else
			return cmmdc(y,x%y);
		
		
			
	}

}
