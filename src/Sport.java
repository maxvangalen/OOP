
public class Sport {
	
	public String name;
	public int number;
	public boolean check;
	
	public void startSport() {
		System.out.println("Sport " + name + " is gestart" + number + check);
	}
	
	public boolean startSport1(int number, String name) {
		System.out.println("Number = " + number);
		System.out.println("Naam = " + name);
		
		return true;
	}
	

	
}
