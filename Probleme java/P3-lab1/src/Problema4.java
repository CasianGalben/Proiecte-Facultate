import java.util.Random;

public class Problema4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
		Random a=new Random();
		for(int i=0;i<n;i++)
		{
			//int nr=a.nextInt(6)+1;
			int nr=a.nextInt(6)+1;
			int nr2=(int)(Math.random()*6)+1;
			System.out.println(nr);
			
		}

	}

}
