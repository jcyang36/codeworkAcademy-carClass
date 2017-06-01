package cars;

public class CarApp {
/**
 * 
 * @author: Joyce Yang
 */
	public static void main(String[] args) {

		
		//Car c = new Car();
		Car p = new Car();	
		
				p.setColor(" Red " );
				p.setSpeed(50);
				p.setBrand("Porsche");
				
				
				print(p.getBrand());
				print(p.getColor());
				System.out.println(p.getSpeed());
				
				
		Car j = new Car();
			
		
		j.setColor(" Blue " );
		j.setSpeed(40);
		j.setBrand(" Jetta ");
		
		
		
		
		
	
		print(p.start());
		print(j.start());
		print(p.accelerate());
		print(j.accelerate());
		print(j.go(40));
		print(p.stop());
		print(j.stop());
		
		print(j.passed("Porsche"));
		

	}
	private static void print(String s){
		System.out.println(s);
	}
}
