package pb1;
import java.util.*;
import java.util.stream.Stream;
public class Elev {
	private String nume;
	private int clasa;
	Map<String,Vector<Integer>> note;
	
	public Elev(String nume, int clasa, Map<String, Vector<Integer>> note) {
		super();
		this.nume = nume;
	
		this.clasa = clasa;
		this.note = note;
	}

	public Elev() {
		super();
	}

	/**
	 * @return the nume
	 */
	public String getNume() {
		return nume;
	}

	/**
	 * @param nume the nume to set
	 */
	public void setNume(String nume) {
		this.nume = nume;
	}

	/**
	 * @return the clasa
	 */
	public int getClasa() {
		return clasa;
	}

	/**
	 * @param clasa the clasa to set
	 */
	public void setClasa(int clasa) {
		this.clasa = clasa;
	}

	/**
	 * @return the note
	 */
	public Map<String, Vector<Integer>> getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 * @throws ExceptiiElev 
	 */
	/*
	public void setNote(Map<String, Vector<Integer>> note) throws ExceptiiElev {
		  boolean ok = note.values()
				.stream()
				.flatMap(v -> v.stream()
				.allMatch(n->(n>=1 && n<=10)));
		if(ok)
			this.note=note;
		else
			throw new ExceptiiElev("Notele nu sunt de la 1 pana la 10");
	}
	*/

	@Override
	public String toString() {
		return "Elev [nume=" + nume + ", clasa=" + clasa + ", note=" + note + "]";
	}
	
	
	public double mediaMaterie(String numeMaterie)
	{
		double ma=0;
		if(note.containsKey(numeMaterie))
			ma=note.get(numeMaterie)
			.stream()
			.mapToInt(x-> x)
			.average()
			.orElse(-1);
		else
		{
			//throw new ExceptiiElev("Nu exista materia " + numeMaterie);
		}
		return ma;
	}
	
	
	public double mediaGenerala() {
		double medieGen=0;
		note.values()
		.stream()
		.map(v->v.stream()
		.mapToInt(Integer::intValue)
		.average()
		.orElse(1))
		.mapToDouble(Double::doubleValue)
		.average()
		.orElse(-1);
		return medieGen;
	}
	
	public void adauga(String materie,int nota)
	{
		if(note.containsKey(materie))
			note.get(materie).add(nota);
		else
		{
			//throw new ExceptiiElev("Materia nu exista");
	}
	}
}
