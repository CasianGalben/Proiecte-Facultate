import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class Meniu {
    private static Scanner scanner = new Scanner(System.in);
    private static Spital spital;


     public static void showMenu(Spital spital) {
         Meniu.spital = spital;
      System.out.println("Bine ai venit");
      System.out.println();

      char option = '\0';
      do {
          System.out.println("=== [Meniu Principal] ===");
          System.out.println("Actiuni posibile:");
          System.out.println("1 - Explorare Spital");
          System.out.println("2 - Sari la Clinica");
          System.out.println("3 - Sari la Sectie");
          System.out.println("4 - Sari la Pacient");
          System.out.println("0 - Salveaza si Iesi");
          System.out.print("-> ");
          option = scanner.nextLine().charAt(0);
          System.out.println();

          switch(option) {
              case '1' :
                  showSpital(spital);
              break;
              case '2' :
                  System.out.println("Nume clinica: ");
                  String numeClinica = scanner.nextLine();
                  for(Clinica clinica : spital.getListaClinici()) {
                      if(clinica.getNume().equals(numeClinica)) {
                          showClinica(clinica);
                          break;
                      }
                  }
              break;
              case '3' :
                  System.out.println("Nume sectie: ");
                  String numeSectie = scanner.nextLine();
                  for(Clinica clinica : spital.getListaClinici()) {
                      for(Sectie sectie : clinica.getlistaSectii()) {
                          if(sectie.getNume().equals(numeSectie)) {
                              showSectie(sectie);
                              break;
                          }
                      }
                  }
                  break;
              case '4' :
                  System.out.println("CNP Pacient: ");
                  String cnpPacient = scanner.nextLine();
                  for(Clinica clinica : spital.getListaClinici()) {
                      for(Sectie sectie : clinica.getlistaSectii()) {
                          for(Pacient pacient : sectie.getListaPacienti()) {
                              if(pacient.getCnp().equals(cnpPacient)) {
                                  showPacient(pacient);
                                  break;
                              }
                          }
                      }
                  }
              break;
              case '0':
                  scanner.close();
                  return;
              default :
              System.out.println("Eroare: Optiune invalida. Va rugam introduceti 1, 2, 3, 4, 0");
              break;
          }
      }  while (option != '0');
         scanner.close();

    }

    private static void showSpital(Spital spital) {
        System.out.println("=== [Spital] ===");
        System.out.println("Nume: " + spital.getNume());
        System.out.println("Lista clinici: ");
        for(Clinica clinica : spital.getListaClinici()) System.out.println(" - " + clinica.getNume());
        System.out.println();

        char option = '\0';
        do {
            System.out.println("=== [Meniu Spital] ===");
            System.out.println("Actiuni posibile:");
            System.out.println("1 - Explorare Clinica");
            System.out.println("2 - Afisare Istoric Externari");
            System.out.println("0 - Inapoi");
            System.out.print("-> ");
            option = scanner.nextLine().charAt(0);
            System.out.println();

            switch(option) {
                case '1' :
                    System.out.println("Nume clinica: ");
                    String numeClinica = scanner.nextLine();
                    for(Clinica clinica : spital.getListaClinici()) {
                        if(clinica.getNume().equals(numeClinica)) {
                            showClinica(clinica);
                            break;
                        }
                    }
                    break;
                case '2' :
                    for(Date date : spital.getIstoricExternari().keySet())
                        System.out.println(date.toString() + ", Pacient: " + spital.getIstoricExternari().get(date).getNume() + ' ' + spital.getIstoricExternari().get(date).getPrenume());
                    System.out.println("================");
                    break;
                case '0' :
                    return;
                default :
                    System.out.println("Eroare: Optiune invalida. Va rugam introduceti 1, 2, 0");
                    break;
            }
        }  while (option != '0');
    }

    private static void showClinica(Clinica clinica) {
        System.out.println("=== [Clinica] ===");
        System.out.println("Nume: " + clinica.getNume());
        System.out.println("Lista sectii: ");
        for(Sectie sectie : clinica.getlistaSectii()) System.out.println(" - " + sectie.getNume());
        System.out.println();

        char option = '\0';
        do {
            System.out.println("=== [Meniu Clinica] ===");
            System.out.println("Actiuni posibile:");
            System.out.println("1 - Explorare Sectie");
            System.out.println("2 - Vezi internari dintr-o anumita data");
            System.out.println("0 - Inapoi");
            System.out.print("-> ");
            option = scanner.nextLine().charAt(0);
            System.out.println();

            switch(option) {
                case '1' :
                    System.out.println("Nume sectie: ");
                    String numeSectie = scanner.nextLine();
                    for(Sectie sectie : clinica.getlistaSectii()) {
                        if(sectie.getNume().equals(numeSectie)) {
                            showSectie(sectie);
                            break;
                        }
                    }
                    break;
                case '2':
                    System.out.println("Introduceti data:");
                    System.out.println("An: ");
                    Integer an = Integer.parseInt(scanner.nextLine());
                    System.out.println("Luna: ");
                    Integer luna = Integer.parseInt(scanner.nextLine());
                    System.out.println("Zi: ");
                    Integer zi = Integer.parseInt(scanner.nextLine());
                    Date dataSpecificata = new Date(an-1900, luna, zi);
                    System.out.println(dataSpecificata);
                    for(Sectie sectie : clinica.getlistaSectii()) {
                        for(Pacient pacient : sectie.getListaPacienti()) {
                            if(pacient.getDataInternare().equals(dataSpecificata)) {
                                System.out.println(" - " + pacient.getCnp() + ' ' + pacient.getNume() + ' ' + pacient.getPrenume());
                            }
                        }
                    }
                    break;
                case '0' :
                    return;
                default :
                    System.out.println("Eroare: Optiune invalida. Va rugam introduceti 1, 0");
                    break;
            }
        }  while (option != '0');

    }

    private static void showSectie(Sectie sectie) {
        System.out.println("=== [Sectie] ===");
        System.out.println("Nume: " + sectie.getNume());
        System.out.println("Nr locuri: " + sectie.getNrLocuri());
        System.out.println("Grad ocupare: " + sectie.getGradOcupare() + '%');
        System.out.println("Lista Pacienti: ");
        for(Pacient pacient : sectie.getListaPacienti()) System.out.println(" - " + pacient.getCnp() + ' ' + pacient.getNume() + ' ' + pacient.getPrenume());
        System.out.println();

        char option = '\0';
        do {
            System.out.println("=== [Meniu Sectie] ===");
            System.out.println("Actiuni posibile:");
            System.out.println("1 - Explorare Pacient");
            System.out.println("2 - Internare Pacient");
            System.out.println("0 - Inapoi");
            System.out.print("-> ");
            option = scanner.nextLine().charAt(0);
            System.out.println();

            switch(option) {
                case '1' :
                    System.out.println("CNP Pacient: ");
                    String cnpPacient = scanner.nextLine();
                    for(Pacient pacient : sectie.getListaPacienti()) {
                        if(pacient.getCnp().equals(cnpPacient)) {
                            showPacient(pacient);
                            break;
                        }
                    }
                    break;
                case '2':
                    System.out.println("Nume Pacient: ");
                    String nume = scanner.nextLine();
                    System.out.println("Prenume Pacient: ");
                    String prenume = scanner.nextLine();
                    System.out.println("Sex Pacient (M/F): ");
                    String sex = scanner.nextLine();
                    System.out.println("CNP Pacient: ");
                    String cnp = scanner.nextLine();
                    System.out.println("Tip Internare ('c' pentru Control, 't' pentru tratament): ");
                    TipInternare tipInternare;
                    char tipAbreviat = scanner.nextLine().charAt(0);
                    if(tipAbreviat == 'c')
                        tipInternare = TipInternare.CONTROL;
                    else if(tipAbreviat == 't')
                        tipInternare = TipInternare.TRATAMENT;
                    else {
                        System.out.println("Tip de internare invalid.");
                        break;
                    }
                    System.out.println("Verificati datele. Confirmati internarea? (y/n):");
                    if(scanner.nextLine().charAt(0) == 'y') {
                        switch (spital.internare(sectie, Date.from(Instant.now()), nume, prenume, sex, cnp, tipInternare)) {
                            case 0:
                                System.out.println("Pacientul nu a fost internat din cauza unei erori.");
                                break;
                            case 1:
                                System.out.println("Pacientul a fost internat cu succes! (prima internare a acestui pacient in spital)");
                                break;
                            case 2:
                                System.out.println("Pacientul a fost internat cu succes! (a mai fost internat, dar nu suficient pt discount)");
                                break;
                            case 3:
                                System.out.println("Pacientul a fost internat cu succes! Pacientul dispune de DISCOUNT de peste 2 vizite / an!");
                                break;
                        }
                    }
                    break;
                case '0' :
                    return;
                default :
                    System.out.println("Eroare: Optiune invalida. Va rugam introduceti 1, 0");
                    break;
            }
        }  while (option != '0');

    }

    private static void showPacient(Pacient pacient) {
        System.out.println("=== [Pacient] ===");
        System.out.println("Nume: " + pacient.getNume());
        System.out.println("Prenume: " + pacient.getPrenume());
        System.out.println("CNP: " + pacient.getCnp());
        System.out.println("Sex: " + pacient.getSex());
        System.out.println("Data internare: " + pacient.getDataInternare());
        System.out.println("Tip internare: " + pacient.getTipInternare());
        System.out.println();

        char option = '\0';
        do {
            System.out.println("=== [Meniu Pacient] ===");
            System.out.println("Actiuni posibile:");
            System.out.println("1 - Externare Pacient");
            System.out.println("0 - Inapoi");
            System.out.print("-> ");
            option = scanner.nextLine().charAt(0);
            System.out.println();

            switch(option) {
                case '1' :
                    System.out.println("Pacientul va fi externat cu data de astazi. Confirmati? (y/n): ");
                    if(scanner.nextLine().charAt(0) == 'y') {
                        if(spital.externare(pacient, Date.from(Instant.now())))
                            System.out.println("Pacient externat cu succes!");
                        else
                            System.out.println("Pacientul nu a fost externat din cauza unei erori.");
                    }
                    break;
                case '0' :
                    return;
                default :
                    System.out.println("Eroare: Optiune invalida. Va rugam introduceti 1, 0");
                    break;
            }
        }  while (option != '0');

    }
    
}
