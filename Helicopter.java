
public class Helicopter extends Aircraft{
	private final int maxpassengers = 40;
	private int passengers;
	
	public Helicopter(){
		passengers = 1;
	}
	
	public Helicopter(int p){
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
		return "Helicopter: "+super.toString()+"Maximum Passengers: "+maxpassengers+"\n"+"Passengers: "+passengers+"\n";
	}

}
