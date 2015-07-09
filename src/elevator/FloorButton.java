package elevator;

import java.util.Random;

public class FloorButton implements Button{
	 int randomInt;
	public Floor buttonPress() {
		// TODO Auto-generated method stub
		System.out.println("Button pressed..");
		Random randomGenerator = new Random();
		randomInt = randomGenerator.nextInt(10);
		System.out.println("Random floor: " + randomInt);
		Floor f1 = new Floor(randomInt);
		return f1;
	}

}
