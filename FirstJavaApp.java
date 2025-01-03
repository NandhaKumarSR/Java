//This console app lets you create a series of folders in your directory

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; //used to get inputs

public class FirstJavaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHello! Welcome to folder maker 😀");
        System.out.println("This application lets you create a series of folders quickly.");
        System.out.println("You can exit the application at any point by pressing ctrl+c\n");
        boolean run = true;

        while (run) {
            System.out.println("Enter/Paste the directory where you need to create the folders.\n" +
                    "Example: " + new File(".").getAbsolutePath());

            String directory = getValidDirectory(scanner);

            System.out.print("Enter the name of the folder: ");
            String folderName = scanner.nextLine();
            folderName = folderName == null ? "" : folderName;
            System.out.println("Do you want to start from 1?\nexample: " + folderName + " 1 will be the name of the first folder:");

            List<String> options = List.of("y", "n", "Y", "N");
            System.out.print("Enter Y to continue or N to enter a different start number. (Y/N): ");
            String userOption = getValidOption(scanner, options).toLowerCase();

            int startNumber = 1;
            if (userOption.equals("n")) {
                System.out.print("Enter the start number: ");
                startNumber = getValidNumber(scanner);
            }

            System.out.print("Enter the end number: ");
            int endNumber;
            do {
                endNumber = getValidNumber(scanner);
                if (startNumber > endNumber) {
                    System.out.println("End number should be greater than start number");
                }
            } while (endNumber < startNumber);

            for (int folderNumber = startNumber; folderNumber <= endNumber; folderNumber++) {
                File folder = new File(directory, folderName + " " + folderNumber);
                if (folder.exists()) {
                    options = List.of("s", "r", "S", "R");
                    System.out.print(folderName + " " + folderNumber + " exists, Enter 'S' to skip or 'R' to Replace (S/R): ");
                    userOption = getValidOption(scanner, options).toLowerCase();
                    if (userOption.equals("s")) {
                        continue;
                    }
                    deleteDirectory(folder);
                }
                folder.mkdirs();
            }
            System.out.println("Folders created successfully!!! Please check the directory.\n");

            System.out.print("Enter 0 to exit the application or 1 to rerun (0/1): ");
            options = List.of("0", "1");
            userOption = getValidOption(scanner, options);
            if (userOption.equals("0")) {
                run = false;
            } else if (userOption.equals("1")) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        }
        scanner.close();
    }

    private static int getValidNumber(Scanner scanner) {
        int number = 0;
        boolean valid = false;
        while (!valid) {
            try {
                number = Integer.parseInt(scanner.nextLine());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number.");
            }
        }
        return number;
    }

    private static String getValidOption(Scanner scanner, List<String> options) {
        String option = "";
        boolean valid = false;
        while (!valid) {
            option = scanner.nextLine().trim();
            if (options.contains(option)) {
                valid = true;
            } else {
                System.out.println("Enter a valid option.");
            }
        }
        return option;
    }

    private static String getValidDirectory(Scanner scanner) {
        String directory = "";
        boolean valid = false;
        while (!valid) {
            directory = scanner.nextLine();
            File dir = new File(directory);
            if (dir.exists() && dir.isDirectory()) {
                valid = true;
            } else {
                System.out.println("Enter a valid directory.");
            }
        }
        return directory;
    }

    private static void deleteDirectory(File directory) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    deleteDirectory(file);
                }
            }
        }
        directory.delete();
    }
}



/*import java.util.Scanner;

public class JavaVariables {
    public static void main(String[] args) {
        int passengers = 5; // -2,147,483,648 to  2,147,483,648 Memory: 4 Bytes (4*8 =32 bits)
        System.out.println(passengers);

        Scanner scn = new Scanner(System.in);

        int busTickets = passengers;
        System.out.println(busTickets);

        String passengerName = "John Doe"; //Memory varies, empty string = 24 Bytes
        char passengerInitial ='A'; //Memory: 2 Bytes, follows ASCII standards

        long totalPassengers = 10000000000L; // -9,223,372,036,854,775,808 to  9,223,372,036,854,775,808 Memory: 8 Bytes (8*8 =64 bits)
        totalPassengers = 10_000_000_000L; // More readable form

        double averageFare = 859.332356; //15 digits
        }
    
}*/
