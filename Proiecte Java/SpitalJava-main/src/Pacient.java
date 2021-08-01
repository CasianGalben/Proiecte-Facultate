import java.util.Date;

import java.util.Objects;
import java.util.regex.Pattern;



public class Pacient {
    private String nume, prenume, cnp, sex;
    private Date dataInternare;
    private TipInternare tipInternare;


    public Pacient(String nume, String prenume, String sex, String cnp) {
        this.nume = nume;
        this.prenume = prenume;
        this.sex = sex;
        this.cnp = cnp;
    }

    public String getNume() {
        return this.nume;
    }


    public String getPrenume() {
        return this.prenume;
    }


    public String getSex() {
        return this.sex;
    }

    public String getCnp() {
        return this.cnp;
    }

    public Date getDataInternare() { return dataInternare; }

    public TipInternare getTipInternare() { return tipInternare; }

    public void internare(Date dataInternare, TipInternare tipInternare) {
        this.dataInternare = dataInternare;
        this.tipInternare = tipInternare;
    }

    public void externare() {
        this.dataInternare = null;
        this.tipInternare = null;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pacient)) {
            return false;
        }
        Pacient pacient = (Pacient) o;
        return Objects.equals(nume, pacient.nume) && Objects.equals(prenume, pacient.prenume) && Objects.equals(sex, pacient.sex) && Objects.equals(cnp, pacient.cnp) && Objects.equals(dataInternare, pacient.dataInternare) && Objects.equals(tipInternare, pacient.tipInternare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, prenume, sex, cnp, dataInternare, tipInternare);
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", cnp='" + cnp + '\'' +
                ", sex='" + sex + '\'' +
                ", dataInternare=" + dataInternare +
                ", tipInternare=" + tipInternare +
                '}';
    }

    public static boolean isWord(String in)
    {
        return Pattern.matches("[a-zA-Z]", in);
    }
   
    
    
}
