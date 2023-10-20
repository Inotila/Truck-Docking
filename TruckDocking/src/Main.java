import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String driverName = new Driver().toString();
        Docks dockInfoChoice = new Docks();
        Register registerVehicle = new Register();

        int driverChoice = 0;
        int continueWithDocking = 0;
        int registerAfterViewingDockedVehicles = 0;

        //welcome driver and get name
        while (true) {
            System.out.print("Welcome to Dumpa Mera! Please enter your Name:");
            driverName = scanner.nextLine();
            if(driverName instanceof String)
                break;
        }

        System.out.print("Hi " + driverName + "! To view the vehicles docked: enter 1 | " +
                "To register your vehicle enter 2:");

        //options to register or see parked vehicles
        do {
            driverChoice = scanner.nextInt();
            if (driverChoice != 1 && driverChoice != 2)
                System.out.print("Invalid entry! Please enter 1 (see parked vehicles) or 2 (register vehicles) ");
        } while (driverChoice != 1 && driverChoice != 2);

        // condition to see the docked vehicles
        if (driverChoice == 1){
            dockInfoChoice.dockInfo();
            //ask user if they would like to register their vehicle or exit program
            System.out.println("Would you like to register your vehicle?| Enter 1 if Yes| Enter 2 if No");
            registerAfterViewingDockedVehicles = scanner.nextInt();
            if (registerAfterViewingDockedVehicles == 1){
                registerVehicle.registerVehicle();
            }
            else {
                System.out.println("Thank you! Please come again!");
            }
        } else {
       registerVehicle.registerVehicle();
        }

        RestartMenu restartMenu = new RestartMenu();
        restartMenu.restart();
    }
}