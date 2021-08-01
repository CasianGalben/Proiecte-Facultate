import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Clinica {

    private String nume;
    private List<Sectie> listaSectii;

    public Clinica(String nume, List<Sectie> listaSectii) {
        this.nume = nume;
        this.listaSectii = listaSectii;
    }

    public String getNume() {
        return this.nume;
    }

    public List<Sectie> getlistaSectii() {
        return this.listaSectii;
    }

    public void setlistaSectii(List<Sectie> listaSectii) {
        this.listaSectii = listaSectii;
    }

    public void addSectie(Sectie sectie) { this.listaSectii.add(sectie); }

    public List<Double> getGradeOcupareSectii() {
        ArrayList<Double> ocupare = new ArrayList<>();
        for(Sectie sectie : listaSectii) {
            ocupare.add(sectie.getGradOcupare());
        }
        return ocupare;
    }

    public int size() { return listaSectii.size(); }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Clinica)) {
            return false;
        }
        Clinica clinica = (Clinica) o;
        return Objects.equals(nume, clinica.nume) && Objects.equals(listaSectii, clinica.listaSectii);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, listaSectii);
    }

    @Override
    public String toString() {
        return "Clinica{" +
                "nume='" + nume + '\'' +
                ", listaSectii=" + listaSectii +
                '}';
    }
}
