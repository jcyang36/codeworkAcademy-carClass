package cars;

public class CarApp {

	public static void main(String[] args) {

		
		//Car c = new Car();
		Jetta j = new Jetta();
		Porsche p = new Porsche();
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
