import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {
	
	public static void main(String[] args)
	{
		List<BradDeCraciun> lista = new ArrayList<>();
		lista.add(new BradDeCraciun(100,"Natural",10));
		lista.add(new BradDeCraciun(300,"Natural",10));
		lista.add(new BradDeCraciun(250,"Natural",19));
		lista.add(new BradDeCraciun(124,"Natural",18));
		lista.add(new BradDeCraciun(1244,"Natural",12));
		lista.add(new BradDeCraciun(11241,"Natural",15));
		
		for(BradDeCraciun el : lista)
		{
			System.out.println(el);
		}
		
	}
	
	static void serializare(List<BradDeCraciun> lista, File fisier)
	{   
		
		try {
			FileOutputStream fos = new FileOutputStream(fisier);
			ObjectOutputStream os = new ObjectOutputStream(fos);
			
			for(BradDeCraciun el : lista)
				os.writeObject(el);
			
			os.close();
			fos.close();
			
			System.out.println("Done");
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	
	
}
