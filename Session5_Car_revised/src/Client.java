
public class Client {
	
	public static void main(String args[]) {
		SubSystem car = new SubSystem(); // Full Car
		
		SubSystem engine = new SubSystem(); // Sub System
		CarInterface piston = new Component(100);// Component
		CarInterface fuelinjector = new Component(300);
		engine.addItem(piston);
		engine.addItem(fuelinjector);
		car.addItem(engine);
		
		SubSystem body = new SubSystem(); // Sub System
		CarInterface door = new Component(400);// Component
		CarInterface window = new Component(200);
		engine.addItem(door);
		engine.addItem(window);
		car.addItem(body);
		
		System.out.println(car.getPrice());
	
	}
}
