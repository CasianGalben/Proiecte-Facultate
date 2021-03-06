import java.util.Date;
import java.util.Objects;
import java.util.regex.Pattern;

public class Produs {
    public String nume, firma, producator;
    public Date dataPrimireProdus;
    public TimpProdus timpProdus;
	public Produs(String nume, String firma, String producator, Date dataPrimireProdus, TimpProdus timpProdus) {
		super();
		this.nume = nume;
		this.firma = firma;
		this.producator = producator;
		this.dataPrimireProdus = dataPrimireProdus;
		this.timpProdus=timpProdus;
	}

public String getNume() {
	  return nume;
	}
/**
 * Seteaza Numele 
 * @param nume String
 */
public void setNume(String nume) {
	  this.nume = nume;
	}
/**
 * Returneaza firma 
 * @return firma
 */
public String getFirma() {
	  return firma;
	}

public void setFirma(String firma) {
	  this.firma = firma;
	}
/**
 * Returneaza producatorul 
 * @return producator
 */
public String getProducator() {
	  return producator;
	}
/**
 * seteaza producatoul
 * @param producator String
 */
public void setProducator(String producator) {
	  this.producator = producator;
	}

public Date getDataPrimireProdus()
	{ return dataPrimireProdus; 
	}
	
	
public TimpProdus getTimpProdus() 
	{ return timpProdus; 
	}
/**
 * Primirea produselor 	
 * @param dataPrimireProdus Date
 * @param timpProdus TimpProdus
 */
public void primireaProduselor(Date dataPrimireProdus, TimpProdus timpProdus) {
	  this.dataPrimireProdus = dataPrimireProdus;
	  this.timpProdus = timpProdus;
	}

public void expediereProdus() {
	  this.dataPrimireProdus = null;
	  this.timpProdus = null;
    }

@Override
public String toString() {
	return "Produs [nume=" + nume + ", firma=" + firma + ", producator=" + producator + ", dataPrimireProdus="
			+ dataPrimireProdus + ", timpProdus=" + timpProdus + "]";
}
	   
	   
	   
}	