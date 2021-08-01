public class Client {
	private String nume;

	
	public Client() {
		// TODO Auto-generated constructor stub
	}

	
	public Client(String nume) {
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
		return "Client:" + nume;
	}
	
	
}
