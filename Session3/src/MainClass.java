
public class MainClass {

	public static void main(String[] args) {
		Car myCar = new Car();

		Chassis carChassis = new Chassis();
		carChassis.getprice();

		Door carDoor = new Door();
		carDoor.getprice();

		Engine carEngine = new Engine();
		carEngine.getprice();

		Tyre carTyre = new Tyre();
		carTyre.getprice();

		Window carWindow = new Window();
		carWindow.getprice();

		CarParts carParts = new CarParts(carChassis, carEngine, carDoor, carTyre, carWindow);

		System.out.println("Total price of the car is " + carParts.getprice());

		/*
		 * Car c1 = new Chassis(); Car c2 = new Chassis();
		 * 
		 * c1.getprice(); c2.getprice();
		 */}

}
