
public class Blimp extends Aircraft{
	private final int maxpassengers = 40;
	private int passengers;
	
	public Blimp(){
		passengers = 1;
	}
	
	public Blimp(int p){
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
		return "Blimp: "+super.toString()+"Maximum Passengers: "+maxpassengers+"\n"+"Passengers: "+passengers+"\n";
	}

}
