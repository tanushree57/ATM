//Car Program

public class MainClass {

	public static void main(String[] args) {

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

		}

}
