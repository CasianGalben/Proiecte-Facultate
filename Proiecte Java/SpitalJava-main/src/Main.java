
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

//import java.util.ArrayList;
//import java.util.Arrays;


public class Main {

    public static void main(String[] args) 
    

    {
         Sectie sectie1 = new Sectie("ATI", 5, new ArrayList<>(Arrays.asList()));
         Sectie sectie2 = new Sectie("Radio", 10, new ArrayList<>(Arrays.asList()));
         Clinica clinica1 = new Clinica("Profilaxis", new ArrayList<>(Arrays.asList(sectie1, sectie2)));
         Spital spital = new Spital("Spitalul Asta", new ArrayList<>(Arrays.asList(clinica1)));


         System.out.println(spital.internare(sectie1, new Date(120, 10, 28), "Razvan", "Dragos", "M", "1242151251", TipInternare.CONTROL));
        System.out.println(spital.externare("1242151251", new Date(120, 10, 28)));
        System.out.println(spital.internare(sectie1, new Date(120, 10, 29), "Razvan", "Dragos", "M", "1242151251", TipInternare.CONTROL));
        System.out.println(spital.externare("1242151251", new Date(120, 10, 29)));
        System.out.println(spital.internare(sectie1, new Date(120, 10, 30), "Razvan", "Dragos", "M", "1242151251", TipInternare.CONTROL));
        System.out.println(spital.externare("1242151251", new Date(120, 10, 30)));;
        System.out.println(spital.internare(sectie1, new Date(120, 10, 31), "Razvan", "Dragos", "M", "1242151251", TipInternare.CONTROL));
        System.out.println(spital.externare("1242151251", new Date(120, 10, 31)));
        System.out.println(spital.internare(sectie1, new Date(120, 10, 31), "Razvan", "Dragos", "M", "1242151251", TipInternare.CONTROL));


        /*
         CSVFileHandler h = new CSVFileHandler("continut.csv");
         List<List<String>> content = h.getContinut();
         content.stream().forEach(l -> l.stream().forEach(System.out::println));
         */
         try {
             CSVFileHandler.createStudentsFromFile("continut.csv");
         }
         catch (Exception e) {

            }

        Meniu.showMenu(spital);

        //List<Pacient> listaPacienti = new ArrayList<>();
        /*
        @SuppressWarnings( "deprecation" )
        Pacient p = new Pacient("Razvan", "Dragos", "M", "1242151251", new Date(20, 20, 20), new Date(20, 20, 20),
                Internare.TRATAMENT);

        System.out.println(p);
        */
        

         
    }
    
}

