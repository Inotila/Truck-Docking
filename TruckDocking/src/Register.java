import java.util.Scanner;
public class Register {
    int vehicleCategoryRegister = 0;
    String dock;
    String dockAlternative;
    String overRideDock;
    String vehicleType;
//    int weight;
    int weightQualifiesForAlternateDock;
    public void registerVehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "What type of vehicle do you have? [Option 1]: Van | [Option 2]: Small Truck | [Option 3]: Heavy Truck");
        do {
            vehicleCategoryRegister = scanner.nextInt();
            if (vehicleCategoryRegister == 1){
                vehicleType = "Van";
                dock = "Dock A";
                dockAlternative = "Dock B";
                System.out.println( "You Vehicle is a :" + vehicleType + "| Dock in: " + dock + "| Thank you!" );
            }
            else if (vehicleCategoryRegister == 2) {
                vehicleType = "Small Truck";

                // check if the vehicle weighs less than 5 tonnes so that is can be assigned a dock(s)
                System.out.println("Does your vehicle weigh less than 5 tonnes? If yes enter 1 | If no enter 2");
                weightQualifiesForAlternateDock =scanner.nextInt();
                if (weightQualifiesForAlternateDock == 1){
                    dock = "Dock C";
                    dockAlternative = "Dock D";
                    overRideDock = "Dock A";
                    System.out.println( "You Vehicle is a :" + vehicleType + "| Dock in: " + dock + " or " + dockAlternative + " " + overRideDock + " | Thank you!" );
                } else {
                    dock = "Dock C";
                    dockAlternative = "Dock D";
                    System.out.println( "You Vehicle is a :" + vehicleType + "| Dock in: " + dock + " or " + dockAlternative + " | Thank you!" );
                }
            } else if (vehicleCategoryRegister == 3) {
                dock = "Dock E";
                vehicleType = "Heavy Truck";

                // check if the vehicle weighs less than 9 tonnes so that is can be assigned a dock(s)
                System.out.println("Does your vehicle weigh less than 9 tonnes? If yes enter 1 | If no enter 2");
                weightQualifiesForAlternateDock =scanner.nextInt();
                    if (weightQualifiesForAlternateDock == 1){
                    dock = "Dock E";
                    overRideDock = "Dock D";
                    System.out.println( "You Vehicle is a :" + vehicleType + "| Dock in: " + dock + " or " + overRideDock + " | Thank you!" );
                    } else {
                    dock = "Dock E";
                    System.out.println( "You Vehicle is a :" + vehicleType + "| Dock in: " + dock + " or " + dockAlternative + " | Thank you!" );}
                } else System.out.println("Invalid entry![Option 1]: Van | [Option 2]: Small Truck | [Option 3]: Heavy Truck");
        } while ( vehicleCategoryRegister == 0);
    }
}
