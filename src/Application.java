
public class Application {

	public static void main(String[] args) {
		System.out.println("Het werkt!");
		
		new Sport();
		new Sport();
		new Sport();
		
		Sport s; 			// declaration
		s = new Sport(); 	// assignment
		Sport s2= new Sport();	// initialization
		
		s.name = "Voetbal";
		s.number = 11;
		s.check = true;
		s.startSport();
		
		s2.name = "F1";
		s2.number = 20;
		s2.check = false;
		s2.startSport();
		
		// System.out.println(s.name + " " + s.number + " " + s.check);
		// System.out.println(s2.name + " " + s2.number + " " + s2.check);
		
		s2.startSport1(2, "Vissen");
		
		Supermarkt x = new Supermarkt();
		double t = x.startSupermarkt(3,1.5);
		System.out.println(t);
		
		System.out.println("Toevoegen om git te testen");
	}

}
