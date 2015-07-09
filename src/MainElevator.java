
	import java.util.Scanner;

	/*
	 Name: Mayura Sardessai(1327)
	 Name: Meenakshi Tiwari(1359)
	 */
	public class MainElevator {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Elevator e = new Elevator();
			int ch=2;
			while(ch != 4){
			Scanner in = new Scanner(System.in);
			System.out.println(" 1.press 1 to move the elevator\n 2.press 2 get the position of elevator\n 3.press 3 to move elevator on choice.\n 4. Exit");
			
				System.out.println("\nEnter your choice: ");
				ch = in.nextInt();

			switch (ch) {
			  case 1:
				  e.moveElevator(1);
				  e.elevatorPosition();
			        break;
			  case 2: 
				  e.elevatorPosition();
			        break;
			  case 3:int floorNo;
				  System.out.println("enter the floor where you want to go");
				  floorNo = in.nextInt();
				  e.moveElevatorOnChoice(floorNo);
				  e.elevatorPosition();
				//  e.moveElevator();
				    break;
			 
			 
			  default:
			        System.out.println("Exit! Thank you!");
			        break;
			}
			}
					
			/*e.moveElevator(9);
			e.elevatorPosition();
			e.moveElevatorOnChoice(3);
			e.elevatorPosition();*/
			}
		}
		


