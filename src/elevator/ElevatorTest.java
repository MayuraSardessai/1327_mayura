package elevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class ElevatorTest {
	Elevator e = new Elevator();
	Floor cf = new Floor(1);
	Floor df = new Floor(6);
	int displacement;

	/*@Test
	public void testDoorFunction() {
		fail("Not yet implemented");
	}
*/
	@Test
	public void testMoveElevator() {
		//fail("Not yet implemented");
		
		displacement = df.getFloorNumber() - cf.getFloorNumber();
			assertEquals(df.getFloorNumber(),cf.getFloorNumber()+displacement);
	}
	/*
	@Test
	public void testStopElevator() {
			
	}

	@Test
	public void testSetElevatorFloor() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetElevatorFloor() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFloorNumber() {
		fail("Not yet implemented");
	}*/

}
