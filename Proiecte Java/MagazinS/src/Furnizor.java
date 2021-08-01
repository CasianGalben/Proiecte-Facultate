public class Furnizor {
	private String nume;

	
	public Furnizor() {
		// TODO Auto-generated constructor stub
	}

	
	public Furnizor(String nume) {
		this.nume = nume;
	}

	
	public String getNume() {
		return nume;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}

	@Override
	public String toString() {
		return "Furnizor:" + nume;
	}
}
