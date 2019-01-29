

import java.text.DecimalFormat;
import java.util.Scanner; //for keyboard
public class HotelOccupancy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		// equation occupancy rate = number of room occupied / total number of rooms 
		
		System.out.println("How many floors do you have in this hotel");
		int noFloors =  kb.nextInt(); //retrieving the number of floors 
		//now that i think of it, it should have been a do while 
		while(noFloors <= 0) { //forces the user to type at least "1" in as the input
			System.out.println("this is an invalid number try again");
			
			System.out.println("How many floors do you have in this hotel");
			 noFloors =  kb.nextInt();
		}
		
		int totalRooms = 0; //stores total rooms amount
		int usedRooms = 0; //stores total of used rooms in the hotel
		int vacant = 0; // subtract used and unused rooms and gets vacant rooms
		
		for(int i = 1; i <= noFloors; i++) {
			System.out.println("How many rooms are in floor " + i);
			int tempSave = kb.nextInt(); // this is temporary so the variable is checked (dummy variable)
			
			while(tempSave < 10) { //keeps asking the question until there is a valid input
				System.out.println("The Floor should have more than 10 rooms");
				
				System.out.println("How many rooms are in floor " + i);
				 tempSave = kb.nextInt();
			}
			
			totalRooms = totalRooms + tempSave;
			
			System.out.println("How many rooms are occupied in floor " + i);
			usedRooms = usedRooms + kb.nextInt(); //saving the total of rooms occupied
			
			System.out.flush(); //clearing the screen 
			//this loop will keep going till the the amount of floors = the input in the for statement
			
		}
		kb.close();
		
		vacant = totalRooms- usedRooms;
		double occupancyRate = (double)usedRooms/(double)totalRooms;
		
		System.out.println("The hotel has " + totalRooms + " rooms"); //displaying all total room
		System.out.println("The hotel has " + usedRooms +" used rooms "); //displaying the used rooms
		System.out.println("The hotel has " + vacant + " vacant Rooms "); //displaying vacant rooms
		
		DecimalFormat df = new DecimalFormat("###.##"); // for the decimal places
		System.out.println("The hotel's Occupancy Rate is " + occupancyRate + " or %" + df.format((occupancyRate*100))); //displaying the formula
		
		
		
		
	}

}
