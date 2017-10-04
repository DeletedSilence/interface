
public class Truck extends Car{
	private final int maxpassengers = 4;
	private int passengers;
	
	public Truck(){
		passengers = 1;
	}
	
	public Truck(int p){
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
		return "Truck: "+super.toString()+"Maximum Passengers: "+maxpassengers+"\n"+"Passengers: "+passengers+"\n";
	}

}
