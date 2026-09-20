import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean running = true;

        while (running) {
            System.out.println("\n--- Farkle Menu ---");
            System.out.println("1. Add die to meld");
            System.out.println("2. Remove die from meld");
            System.out.println("3. View current meld");
            System.out.println("4. Calculate score");
            System.out.println("5. Bank Points");
            System.out.println("Choose an option: ");
        
            String choice = scanner.nextLine();


            switch (choice) {
                case "1":
                    // Add die to meld
                    System.out.println("Adding die to meld...");
                    break;
                case "2":
                    // Remove die from meld
                    System.out.println("Removing die from meld...");
                    break;
                case "3":
                    // View current meld
                    System.out.println("Viewing current meld...");
                    break;
                case "4":
                    // Calculate score
                    System.out.println("Calculating score...");
                    break;
                case "5":
                    // Bank Points
                    System.out.println("Banking points...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}