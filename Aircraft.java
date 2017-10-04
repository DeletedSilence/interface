
public class Aircraft implements Vehicle {
	private int gear;
	private int speed;
	private int size;
	private String color;
	
	public Aircraft(){
		gear = 1;
		speed = 0;
		color = "White";
		size = 2;
	}
	
	public Aircraft(int g,int s,String c){
		gear = g;
		speed = s;
		color = c;
	}

	public int getGear() {
		return gear;
	}


	public void setGear(int gear) {
		this.gear = gear;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public void gear(int g) {
		// TODO Auto-generated method stub
		gear = g;
	}

	@Override
	public void speed(int accelerate) {
		// TODO Auto-generated method stub
		speed+=accelerate;
	}

	@Override
	public void brake(int decelerate) {
		// TODO Auto-generated method stub
		speed -= decelerate;
	}
	
	@Override
	public String toString(){
		return "Aircraft"+"\n"+"Gear:"+gear+"\n"+"Speed:"+speed+"\n"+"Size:"+size+"\n"+"Color:"+color+"\n";
	}

}
