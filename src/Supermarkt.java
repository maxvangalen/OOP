
public class Supermarkt {

	public String naam;
	public int aantal;
	public double prijs;
	
	public double startSupermarkt(int aantal, double prijs) {
		
		return aantal * prijs;
	}
	
	public Supermarkt() {
		this.naam = naam;
		this.aantal = aantal;
		this.prijs = prijs;
	
	}
	
}

public class Product {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}