package elevator;

public class Elevator {
	Floor currentFloor;
	Floor destFloor;
	int flr;
	Door elevatorDoor;
	//ArrayList<ElevatorButton> elButton = new ArrayList<ElevatorButton>();
	ElevatorButton elButton;
	
	public Elevator()
	{
		currentFloor = new Floor(4);
		//destFloor = new Floor(7);
		elevatorDoor = new ElevatorDoor();
	    elButton = new ElevatorButton();		
	}
	
	void doorFunction()
	{
		elevatorDoor.doorOpen();
	}
	
	int moveElevator(Floor destFloor)
	{
		if(destFloor.getFloorNumber() > currentFloor.getFloorNumber())
		{
			while(destFloor.getFloorNumber() != currentFloor.getFloorNumber() && currentFloor.getFloorNumber() <= 10)
			{
				flr=currentFloor.getFloorNumber();
				currentFloor.setFloorNumber(++flr);
				System.out.println("<--"+currentFloor.getFloorNumber());
			}
		}
		
		if(destFloor.getFloorNumber() < currentFloor.getFloorNumber())
		{
			while(destFloor.getFloorNumber() != currentFloor.getFloorNumber() && currentFloor.getFloorNumber() >= 0)
			{
				flr=currentFloor.getFloorNumber();
				//System.out.println("**>"+currentFloor.getFloorNumber());
				flr--;
				currentFloor.setFloorNumber(flr);
				System.out.println("-->"+currentFloor.getFloorNumber());
			}
		}
		
		if(destFloor.getFloorNumber() == currentFloor.getFloorNumber())
		{
			currentFloor.setFloorNumber(destFloor.getFloorNumber());
			elevatorDoor.doorOpen();
		}
		return flr;
		
	}
	
	void stopElevator()
	{
		
	}
	
	void setElevatorFloor(Floor flr)
	{
		currentFloor = flr;
	}
	
	Floor getElevatorFloor()
	{
		System.out.println("Elevator current floor: " + currentFloor.getFloorNumber());
		return currentFloor;
	}

	public Floor getFloorNumber() {
		// TODO Auto-generated method stub
		//call object of ElevatorButton
		destFloor=elButton.floorNumber();
		return destFloor;
	}
	
}
