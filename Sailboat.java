
public class Sailboat extends Boat{
	private final int maxpassengers = 40;
	private int passengers;
	
	public Sailboat(){
		passengers = 1;
	}
	
	public Sailboat(int p){
		passengers = p;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public int getMaxpassengers() {
		return maxpassengers;
	}
	
	@Override
	public String toString(){
		return "Sailboat: "+super.toString()+"Maximum Passengers: "+maxpassengers+"\n"+"Passengers: "+passengers+"\n";
	}

}
