package elevator;

public class Floor {
	
	int floorNumber;
	Floor destFloor;
	FloorDoor floorDoor;
	Button buttonUp;
	Button buttonDown;
	Elevator el;

	Floor(int currentFloor)
	{
		this.floorNumber=currentFloor;
		 floorDoor = new FloorDoor();
		 buttonUp = new FloorButton();
		 buttonDown = new FloorButton();

	}
	
	void useFloorElevator()
	{
		el = new Elevator();
		System.out.println("===="+el);
		el.getElevatorFloor();
		destFloor=buttonUp.buttonPress();
		System.out.println("Dest number: "+destFloor.getFloorNumber());
		el.moveElevator(destFloor);
		el.getElevatorFloor();
		floorDoor.doorOpen();;
		//el.doorFunction();
		destFloor = el.getFloorNumber();
		System.out.println("Dest number: "+destFloor.getFloorNumber());
		//el.getElevatorFloor();
		el.moveElevator(destFloor);
		destFloor = el.getFloorNumber();
		System.out.println("Dest number: "+destFloor.getFloorNumber());
		el.moveElevator(destFloor);
		el.getElevatorFloor();
		//el.doorFunction();
		//floorDoor.doorFunction();

	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
		
		
		
	}
	
	

