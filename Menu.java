import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean running = true;

        while (running) {
            System.out.println("\n--- Farkle Menu ---");
            System.out.println("A. Add die to meld");
            System.out.println("B. Remove die from meld");
            System.out.println("C. View current meld");
            System.out.println("D. Calculate score");
            System.out.println("E. Bank Points");
            System.out.println("Choose an option: ");
        
            String choice = scanner.nextLine().toUpperCase();


            switch (choice) {
                case "A":
                    // Add die to meld
                    System.out.println("Select a die to add to the meld (A-F): ");
                    String dieChoice = scanner.nextLine().toUpperCase();
                    System.out.println("You chose to add die: " + dieChoice);
                    break;
                case "B":
                    // Remove die from meld
                    System.out.println("Removing die from meld...");
                    break;
                case "C":
                    // View current meld
                    System.out.println("Viewing current meld...");
                    break;
                case "D":
                    // Calculate score
                    System.out.println("Calculating score...");
                    break;
                case "E":
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