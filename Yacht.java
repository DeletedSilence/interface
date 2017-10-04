
public class Yacht extends Boat{
	private final int maxpassengers = 40;
	private int passengers;
	
	public Yacht(){
		passengers = 1;
	}
	
	public Yacht(int p){
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
		return "Yacht: "+super.toString()+"Maximum Passengers: "+maxpassengers+"\n"+"Passengers: "+passengers+"\n";
	}

}
