package elevator;

import java.util.Random;

public class ElevatorButton implements Button{
	int floorNumber;
	int randomInt;
	Floor flr;
	public Floor buttonPress() {
		return null;
				// TODO Auto-generated method stub
		
	}
	public Floor floorNumber() {
		Random randomGenerator = new Random();
		randomInt = randomGenerator.nextInt(10);
		System.out.println("Random elevator: " + randomInt);
		flr = new Floor(randomInt);
		return flr;
		// TODO Auto-generated method stub
		
	}

}
