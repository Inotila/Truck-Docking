import java.util.Scanner;

public class Docks {
    String dock;
    String vehicleType;
    int occupants;
    String availability;
    int vehicleCategory = 0;
    public void dockInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "What type of vehicle do you have? [Option 1]: Van | [Option 2]: Small Truck | [Option 3]: Heavy Truck");
        do {
            vehicleCategory = scanner.nextInt();
            if (vehicleCategory == 1){
                dock = "Dock A and B";
                vehicleType = "Van";
                occupants = 10;
                availability = "5 free spaces";
                System.out.println( "You Vehicle is a :" + vehicleType + "| Can Be Docked in: " + dock + "| Number of occupants: " + occupants + "| Available slots " + availability );
                }
            else if (vehicleCategory == 2) {
                dock = "Dock C and D";
                vehicleType = "Small Truck";
                occupants = 13;
                availability = "2 free spaces";
                System.out.println( "You Vehicle is a :" + vehicleType + "| Can Be Docked in: " + dock + "| Number of occupants: " + occupants + "| Available slots " + availability );
            } else if (vehicleCategory == 3) {
                dock = "Dock E";
                vehicleType = "Heavy Truck";
                occupants = 9;
                availability = "6 free spaces";
                System.out.println( "You Vehicle is a :" + vehicleType + "| Can Be Docked in: " + dock + "| Number of occupants: " + occupants + "| Available slots " + availability );
            } else System.out.println("Invalid entry![Option 1]: Van | [Option 2]: Small Truck | [Option 3]: Heavy Truck");
        } while ( vehicleCategory == 0);
    }
}
