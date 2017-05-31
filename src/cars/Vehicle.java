package cars;

public class Vehicle {

	public String carType;
	
	public String start() {
		return "The"+carType+" is starting...";
	}
	
	public String accelerate() {
		return "The"+carType+" is accelerating...";
	}
	
	
	public String go(int speed) {
		return "The"+carType+" is going "+speed+" mph...";
	}
	
	public String stop() {
		return "The"+carType+" is stopped...";
	}
	
	public String setSpeed(int speed){
		return "The speed is "+speed+" mph.";
	}
}
