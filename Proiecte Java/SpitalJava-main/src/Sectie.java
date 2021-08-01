import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sectie {

    private String nume;
    private int nrLocuri;
    private List<Pacient> listaPacienti;

    public Sectie(String nume, int nrLocuri) {
        this.nume = nume;
        this.nrLocuri = nrLocuri;
        this.listaPacienti = new ArrayList<>();
    }
    public Sectie(String nume, int nrLocuri, List<Pacient> listaPacienti) {
        this.nume = nume;
        this.nrLocuri = nrLocuri;
        this.listaPacienti = listaPacienti;
    }

    public int getNrLocuri() {
        return this.nrLocuri;
    }

    public List<Pacient> getListaPacienti() { return listaPacienti; }

    public void addPacient(Pacient pacient) { this.listaPacienti.add(pacient); }

    public void removePacient(Pacient pacient) { this.listaPacienti.remove(pacient); }

    public double getGradOcupare() {
        // In procente %
        return ((double)this.listaPacienti.size() / (double)nrLocuri)*100;
    }

    public String getNume() {
        return this.nume;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Sectie)) {
            return false;
        }
        Sectie sectie = (Sectie) o;
        return nrLocuri == sectie.nrLocuri && Objects.equals(nume, sectie.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nrLocuri, nume);
    }

    @Override
    public String toString() {
        return "Sectie{" +
                "nume='" + nume + '\'' +
                ", nrLocuri=" + nrLocuri +
                ", listaPacienti=" + listaPacienti +
                '}';
    }
}
