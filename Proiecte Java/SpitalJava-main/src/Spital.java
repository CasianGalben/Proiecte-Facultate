import java.util.*;

public class Spital {
    
    private String nume;
    private List<Clinica> listaClinici;
    private Map<Date, Pacient> istoricExternari;

    public Spital(String nume) { this.nume = nume; }
    public Spital(String nume, List<Clinica> listaClinici) {
        this.nume = nume;
        this.listaClinici = listaClinici;
        this.istoricExternari = new HashMap<>();
    }

    public List<Clinica> getListaClinici() { return this.listaClinici; }

    public void setListaClinici(List<Clinica> listaClinici) { this.listaClinici = listaClinici; }

    public void addClinica(Clinica clinica) {
        this.listaClinici.add(clinica);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    // Return values for internare(...):
    // 0 , daca pacientul nu a fost internat (este deja internat sau nu mai este loc in sectie)
    // 1 , daca pacientul a fost internat pentru prima oara in spital
    // 2 , daca pacientul a fost internat in spital si are vizite precedente, dar nu suficiente pt discount
    // 3 , daca pacientul a fost internat in spital cu un discount bazat pe vizitele precedente in acest an
    public int internare(Sectie sectieInternare, Date dataInternare, String nume, String prenume, String sex, String cnp, TipInternare tipInternare) {
        if (sectieInternare.getGradOcupare() == 100d) return 0;
        for (Clinica clinica : this.listaClinici) {
            for(Sectie sectie : clinica.getlistaSectii()) {
                for(Pacient pacient : sectie.getListaPacienti()) {
                    if(cnp.equals(pacient.getCnp())){
                        return 0;
                    }
                }
            }
        }
        int viziteAnulAcesta = 0;
        Pacient pacientExistent = null;
        for(Date date : this.istoricExternari.keySet()) {
            if(istoricExternari.get(date).getCnp().equals(cnp)) {
                pacientExistent = istoricExternari.get(date);
                if(date.getYear() == dataInternare.getYear())  viziteAnulAcesta++;
            }
        }
        if(pacientExistent != null) {
            pacientExistent.internare(dataInternare, tipInternare);
            sectieInternare.addPacient(pacientExistent);
            if(viziteAnulAcesta >= 2) return 3;
            else return 2;
        }
        else {
            Pacient pacientNou = new Pacient(nume, prenume, sex, cnp);
            pacientNou.internare(dataInternare, tipInternare);
            sectieInternare.addPacient(pacientNou);
            return 1;
        }
    }

    //externare dupa cnp
    // Return values:
    // true , daca pacientul cu acel cnp a fost gasit in spital si externat cu succes
    // false, daca pacientul cu acel cnp nu a fost gasit in spital
    public boolean externare(String cnp, Date dataExternare) {
        for (Clinica clinica : this.listaClinici) {
            for(Sectie sectie : clinica.getlistaSectii()) {
                for(Pacient pacient : sectie.getListaPacienti()) {
                    if(cnp.equals(pacient.getCnp())){
                        pacient.externare();
                        sectie.removePacient(pacient);
                        istoricExternari.put(dataExternare, pacient);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //externare folosind obiect Pacient pt a extrage cnp
    // true , daca pacientul a fost gasit in spital si externat cu succes
    // false, daca pacientul nu a fost gasit in spital
    public boolean externare(Pacient pacientExternare, Date dataExternare) {
        for (Clinica clinica : this.listaClinici) {
            for(Sectie sectie : clinica.getlistaSectii()) {
                for(Pacient pacient : sectie.getListaPacienti()) {
                    if(pacient.getCnp().equals(pacientExternare.getCnp())){
                        pacient.externare();
                        sectie.removePacient(pacient);
                        istoricExternari.put(dataExternare, pacient);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public Map<Date, Pacient> getIstoricExternari() {
        return istoricExternari;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Spital)) {
            return false;
        }
        Spital spital = (Spital) o;
        return Objects.equals(listaClinici, spital.listaClinici);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(listaClinici);
    }


    @Override
    public String toString() {
        return "Spital{" +
                "nume='" + nume + '\'' +
                ", listaClinici=" + listaClinici +
                '}';
    }
}
