package lab5ex2;

public class Floare {
  String nume;
  String specie;
  int pret;
public Floare(String nume, String specie, int pret) {
	super();
	this.nume = nume;
	this.specie = specie;
	this.pret = pret;
}
public Floare() {
	super();
}
@Override
public String toString() {
	return "Floare [nume=" + nume + ", specie=" + specie + ", pret=" + pret + "]";
}
/**
 * @return the pret
 */
public int getPret() {
	return pret;
}
/**
 * @param pret the pret to set
 */

  
}
