import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;



public class Main {
    
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Path fisier=Paths.get("File");
    Path folder=Paths.get("Folder/File");
    try {
		Files.copy(fisier,folder,StandardCopyOption.REPLACE_EXISTING);
		
	} catch (IOException ex) {
	    System.err.format("Eroare la copiere");
	}
	}
}

