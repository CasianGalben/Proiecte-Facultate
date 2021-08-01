package ab;
/**
 * Clasa main 
 * @author Galben Casian
 * 
 */
public class Main {
    public static void main(String[] args) {
        XMan[] xmen = new XMan[10];

        xmen[0] = new Apocalipsa();
        xmen[0].adaugaPuteri(Puteri.Atletism);

        xmen[1] = new Apocalipsa("Apo2");
        xmen[1].adaugaPuteri(Puteri.Atletism);
        xmen[1].adaugaPuteri(Puteri.Aripi);

        xmen[2] = new Magneto();
        xmen[2].adaugaPuteri(Puteri.Telepatie);

        // vector de frecventa al puterilor
        /**
         * Se creeaza vectorul de fregventa
         */
        int[] vf = new int[Puteri.values().length];
        for(XMan x: xmen){
            if(x == null){
                break;
            }
            for(Puteri xp: x.puteri){
                if(xp == null){
                    break;
                }
                vf[xp.ordinal()]+=1; //al catelea in enum
            }
        }

        boolean ok = false;
        for(int i : vf){
            if(i == 1){
                ok = true;
            }
        }
        if(ok == false){
            return;
        }

        for(XMan x: xmen){
            if(x == null){
                break;
            }
            for(Puteri xp: x.puteri){
                if(xp == null){
                    break;
                }
                if(vf[xp.ordinal()]==1){
                    System.out.println(x.nume);
                }
            }
        }
    }
}
