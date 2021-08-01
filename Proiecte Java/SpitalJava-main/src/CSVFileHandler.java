import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class CSVFileHandler {

    private static String fileName;
    private static final String separator=",";

   CSVFileHandler(String fileName) {
   this.fileName = fileName;
   }

    
   public static List<List<String>> getContinut()
   {
       BufferedReader br = null;
       String line;
       List<List<String>> continutFisier = new ArrayList<>();
    try {

        br = new BufferedReader(new FileReader(fileName));
        while ((line = br.readLine()) != null) {

            List<String> linieCurenta = Arrays.asList(line.split(separator));
            continutFisier.add(linieCurenta);

            System.out.println();

        }

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
     return continutFisier;
   }

   public void writeFile(List<List<String>> CSVContent) throws Exception {
        FileWriter writer = null;

        try {
            writer = new FileWriter(fileName);
            for (List<String> line : CSVContent) {
                writer.write(String.join(",", line) + "\n");
            }
        } catch (IOException e) {
            throw new Exception("Failed To Write To File");
        } finally {
            try {
                writer.close();
            } catch(IOException e) {
                throw new Exception("Failed To Close File");
            }
        }

    }

    public static List<Pacient> createStudentsFromFile(String filename) throws Exception {
        List<Pacient> studentsList = new ArrayList<>();
        CSVFileHandler reader = new CSVFileHandler(filename);
        List<List<String>> CSVContent = getContinut();
        for (List<String> line : CSVContent) {
            String nume = line.get(0);
            String prenume = line.get(1);
            String cnp = line.get(2);
            String sex = line.get(3);
            int dataAn = Integer.parseInt(line.get(4));
            int dataLuna = Integer.parseInt(line.get(5));
            int dataZi = Integer.parseInt(line.get(6));
            char tipInternareAbreviat = line.get(7).charAt(0);
            TipInternare tipInternare;
            Date dataInternare = new Date(dataAn, dataLuna, dataZi);
            if(tipInternareAbreviat == 'c') tipInternare = TipInternare.CONTROL;
            else tipInternare = TipInternare.TRATAMENT;
            System.out.println(new Pacient(nume, prenume, cnp, sex));;
        }
        return studentsList;
    }
}
