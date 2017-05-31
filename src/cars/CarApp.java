package cars;

public class CarApp {

	public static void main(String[] args) {

		
		//Car c = new Car();
		Car p = new Car();
				p.carType=" Red Porsche ";
		Car j = new Car();
				j.carType=" Blue Jetta ";
		print(p.start());
		print(j.start());
		print(p.accelerate());
		print(j.accelerate());
		print(p.setSpeed(50));
		print(j.go(40));
		print(p.stop());
		print(j.stop());
		


	}
	private static void print(String s){
		System.out.println(s);
	}
}
