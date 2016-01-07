
public class CarParts {
	
	Chassis carChassis;
	Door carDoor;
	Engine carEngine;
	Tyre carTyre;
	Window carWindow;
	public int price;
	
	public CarParts(Chassis carChassis, Engine carEngine, Door carDoor, Tyre carTyre, Window carWindow) {
		this.carChassis = carChassis;
		this.carEngine = carEngine;
		this.carDoor = carDoor;
		this.carTyre = carTyre;
		this.carWindow = carWindow;
	}

	public int getprice() {
		price = carChassis.getprice() + carEngine.getprice() + carDoor.getprice() + carTyre.getprice() + carWindow.getprice();
		return price;		
	}
	
}
