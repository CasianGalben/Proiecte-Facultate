
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * 
 * @author Galben Casian
 *
 */
public class Inteprindere {
 public String nume;
 public List<Depozit> listaDepozite;
 /**
  * Constuctor pentru nume s lista de depozite
  * @param nume String
  * @param listaDepozite List<Depozit>
  */
 public Inteprindere(String nume, List<Depozit> listaDepozite) {
     this.nume = nume;
     this.listaDepozite = listaDepozite;}
 /**
  * Returneaza numele 
  * @return nume
  */
 public String getNume() {
     return this.nume;
 }
/**
 * Resurneaza lista de depozite
 * @return listaDepozite
 */
 public List<Depozit> getlistaDepzite() {
     return this.listaDepozite;
}
/**
 * Initializeaza lista de depozite 
 * @param listaDepozite List<Depozit> 
 */
 public void setlistaDepozite(List<Depozit> listaDepozite) {
     this.listaDepozite = listaDepozite;
 }
 /**
  * Adaugare Depozite 
  * @param depozit List<Depozit>
  */
 public void adaugareDepozite(Depozit depozit) 
 { this.listaDepozite.add(depozit); }
 
 
public List<Depozit> getListaDepozite() {
	return listaDepozite;
}
/**
 * Initializeaza lista de depozite 
 * @param listaDepozite List<Depozit> 
 */
public void setListaDepozite(List<Depozit> listaDepozite) {
	this.listaDepozite = listaDepozite;
}
/**
 * Seteaza numele 
 * @param nume String
 */
public void setNume(String nume) {
	this.nume = nume;
}
 
@Override
public String toString() {
	return "Inteprindere [nume=" + nume + ", listaDepozite=" + listaDepozite + "]";
}


}
