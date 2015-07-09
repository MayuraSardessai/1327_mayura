
public class Elevator {
	
	Floor flr = new Floor();
	int currentFloor = 0;
	int top = 10;
	
	public void moveElevator(int choice)
	{
		if(choice > flr.getFloor())
		{
			while(choice != flr.getFloor() && flr.getFloor() <= top)
			{
				flr.setFloor(++currentFloor);
			}
		}
		if(choice < flr.getFloor())
		{
			while(choice != flr.getFloor() && flr.getFloor() >= 0)
			{
				flr.setFloor(currentFloor--);
			}
		}
		
		System.out.println("Floor: " + flr.getFloor());
		System.out.println("Current: " + currentFloor);
		System.out.println("Choice: " + choice);
		
		if(choice == flr.getFloor())
		{
			flr.setFloor(choice);
			openElevatorDoor(choice);
		}
		
		

	}
	
	private void openElevatorDoor(int choice) {
		// TODO Auto-generated method stub
		if(choice == currentFloor)
		{
			System.out.println("Door is open... Please enter!!");
		}
	}

	public int elevatorPosition()
	{
		System.out.println("Elevator is at " + currentFloor + " floor.");
		return currentFloor;
	}
	

	public void moveElevatorOnChoice(int choice)
	{
		if(choice < currentFloor)
		{
			while(choice != flr.getFloor() && flr.getFloor() >= 0)
			{
				flr.setFloor(--currentFloor);
			}
		}
		
		if(choice > flr.getFloor())
		{
			while(choice != flr.getFloor() && flr.getFloor() <= top)
			{
				flr.setFloor(++currentFloor);
			}
		}
	}
	
	public void closeElevatorDoor()
	{
		
	}
	
	
}
