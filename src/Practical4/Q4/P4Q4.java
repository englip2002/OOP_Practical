package Practical4.Q4;

import java.util.Scanner;

public class P4Q4 {
    public static void main(String[] args) {
        final int LIMIT = 100;
        int i = 0, j = 0, choice = 0;
        CarType[] carTypes = new CarType[3];

        carTypes[0] = new CarType("Toyota", "Vios", 1.5);
        carTypes[1] = new CarType("Nissan", "Teana", 2.0);
        carTypes[2] = new CarType("Honda", "City", 1.6);

        // temp
        CarRegisteration[] carRegister = new CarRegisteration[LIMIT];

        while (choice != -1) {
            Scanner scanner = new Scanner(System.in);
            
            // accept data, set in one object then transfer to registeration class at the end
            System.out.println("\nCar " + (i+1));
            System.out.print("Enter Name:");
            String name = scanner.nextLine();

            System.out.print("Enter IC No:");
            String ICNo = scanner.next();

            System.out.print("Enter PlateNo:");
            String plateNo = scanner.next();

            System.out.print("Enter Colour:");
            String colour = scanner.next();

            System.out.print("Enter Manifacture Year:");
            int year = scanner.nextInt();

            System.out.println("Make\t\tModel\tCapacity");
            for (j = 0; j < 3; j++) {
                System.out.println((j + 1) + ") " + carTypes[j].toString());
            }

            System.out.print("Enter your choice:");
            int carChoice = scanner.nextInt() - 1;

            carRegister[i] = new CarRegisteration(name, ICNo, plateNo, colour, year, carTypes[carChoice]);

            System.out.print("Continue? (-1 to end):");
            choice = scanner.nextInt();
            // increase i by 1
            i++;
        }

        System.out.printf("%-6s %-15s %-10s %-10s %-10s %-10s %-10s %-10s %-5s\n", "RegNo", "Name", "IcNo", "PlateNo",
                "Colour", "Year", "Make", "Model", "Capacity");
        for (i = 0; i < 2; i++) {
            System.out.println(carRegister[i].toString());
        }

    
    }
}
