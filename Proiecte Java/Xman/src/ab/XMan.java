package ab;

import java.util.Arrays;

public abstract class XMan {
    int varsta;
    double punctaj=0.0f;// initializeaza pe 0 float
    String nume = "";
    int len = 5;
    int buffer = 5;
    int index = 0;
    Puteri[] puteri = new Puteri[5];
    /**
     * Constructor pentru varsta
     * @param varsta int
     */
    public XMan(int varsta) {
        this.varsta = varsta;
    }
    /**
     * Constructor 
     */
    public XMan() { }
    /**
     * Constructor pentru varsta si punctaj
     * @param varsta int
     * @param punctaj double 
     */
    public XMan(int varsta, double punctaj) {
        this.varsta = varsta;
        this.punctaj = punctaj;
    }
    /**
     * Metoda de afisare
     */
    void afisare() {
        System.out.println(punctaj);
    }
    /**
     * Metoda unde se adauga puterea in vectorul de fregventa
     * @param p Puteri
     */
    void adaugaPuteri(Puteri p)
    {
        if(this.index == this.len) {
            this.len += this.buffer;
            Puteri[] temp = Arrays.copyOf(this.puteri, this.puteri.length);
            this.puteri = Arrays.copyOf(temp, this.len);
        }

        this.puteri[this.index] = p;
        this.index++;
        this.punctaj+=calculeazaPunctaj(p);
    }
    /**
     * Metoda unde se adauga punctajul puterilor
     * @param p Puteri
     * @return punct
     */
    private double calculeazaPunctaj(Puteri p){
        double punct = 0.0f;
        switch (p){
            case Teleportare:
                punct = 4.2;
                break;
            case Aripi:
                punct = 4;
                break;
            case Atletism:
                punct = 1.6;
                break;
            case Telepatie:
                punct = 7;
                break;
        }
        return punct;
    }


}