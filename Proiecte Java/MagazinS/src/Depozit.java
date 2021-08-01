import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class Depozit {
	public String nume;
    public int numarProduse;
    public List<Produs> listaProduse;
	

/**
 * Constructor pentru Depozit
 * @param nume String 
 * @param numarProduse int
 */
public Depozit(String nume, int numarProduse) {
        this.nume = nume;
        this.numarProduse = numarProduse;
        this.listaProduse = new ArrayList<>();
    }
/**
 * Constructor pentru Depozit
 * @param nume String 
 * @param numarProduse int
 * @param listaProduse List<Produs>
 */
public Depozit(String nume, int numarProduse, List<Produs> listaProduse) {
    this.nume = nume;
    this.numarProduse = numarProduse;
    this.listaProduse = listaProduse;
}


@Override
public String toString() {
	return "Depozit [nume=" + nume + ", numarProduse=" + numarProduse + ", listaProduse=" + listaProduse + "]";
}
/**
 * Genereaza numele 
 * @return nume
 */
public String getNume() {
	return nume;
}
/**
 * Seteaza numele 
 * @param nume String
 */
public void setNume(String nume) {
	this.nume = nume;
}
/**
 * Numarul produselor
 * @return numarProduse
 */
public int getNumarProduse() {
	return numarProduse;
}
/**
 * Seteaza numarul prduselor 
 * @param numarProduse int
 */
public void setNumarProduse(int numarProduse) {
	this.numarProduse = numarProduse;
}
/**
 * Seteaza lista produselor
 * @param listaProduse List<Produs>
 */
public void setListaProduse(List<Produs> listaProduse) {
	this.listaProduse = listaProduse;
}
/**
 * Returneaza lista 
 * @return listaProduse
 */
public List<Produs> getListaProduse()
{     return listaProduse; 
}
/**
 * Adaugare produse
 * @param produse
 */
public void addProduse(Produs produse)
{    this.listaProduse.add(produse); 

}

public void removeProduse(Produs produse) 
{    this.listaProduse.remove(produse); 

}

	public Double getGradeDepozit() {
		// TODO Auto-generated method stub
		return null;
	}

}
