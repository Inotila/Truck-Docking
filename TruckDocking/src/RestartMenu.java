import java.util.Scanner;

public class RestartMenu {
    public void restart(){
            Scanner scanner = new Scanner(System.in);

            Docks dockInfoChoice = new Docks();
            Register registerVehicle = new Register();

            int driverChoice = 0;
            int registerAfterViewingDockedVehicles = 0;
            int continueWithDockingLoop = 0;

            //options to register or see parked vehicles
        System.out.print("Welcome back to main menu | To view the vehicles docked: enter 1 | " +
                "To register a new vehicle enter 2:");

            do {
                driverChoice = scanner.nextInt();
                if (driverChoice != 1 && driverChoice != 2)
                    System.out.print("Invalid entry! Please enter 1 (see parked vehicles) or 2 (register vehicles) ");
            } while (driverChoice != 1 && driverChoice != 2);

            // condition to see the docked vehicles
            if (driverChoice == 1){
                dockInfoChoice.dockInfo();
                //ask user if they would like to register their vehicle or exit program
                System.out.println("Would you like to register your vehicle?| Enter for Yes| Enter 2 for No");
                registerAfterViewingDockedVehicles = scanner.nextInt();
                if (registerAfterViewingDockedVehicles == 1){
                    registerVehicle.registerVehicle();
                }
                else {
                    //redirecting user back to start or ending program
                    do {
                        System.out.println("Would you like to return to start | Enter 1 for Yes | Enter 2 for No");
                        continueWithDockingLoop = scanner.nextInt();
                        if (continueWithDockingLoop == 1){
                            restart();}
                        else if (continueWithDockingLoop == 2){
                            break;
                        } else {
                            System.out.println("Invalid Entry");
                        }
                    } while (continueWithDockingLoop == 0);
                }
            } else {
                registerVehicle.registerVehicle();
            }
            //redirecting user back to start or ending program
        do {
            System.out.println("Would you like to continue? |Enter 1 for Yes | Enter 2 for No");
            continueWithDockingLoop = scanner.nextInt();
            if (continueWithDockingLoop == 1){
                restart();}
            else if (continueWithDockingLoop == 2){
                break;
            } else {
                System.out.println("Invalid Entry");
            }
        } while (continueWithDockingLoop == 0);
    }
}
