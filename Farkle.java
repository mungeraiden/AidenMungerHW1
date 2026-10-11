import java.util.Scanner;

public class Farkle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("---------------------------------------");
        System.out.println("|          Welcome to Farkle!          |");
        System.out.println("|           By Aiden Munger            |");
        System.out.println("---------------------------------------");

        System.out.print("Enter your username: ");
        String username = scanner.nextLine().trim();
        if (username.isEmpty()) {
            username = "Unknown Player";
        }
        System.out.println("Hello, " + username + "! Let's start the game.");

        Turn turn = new Turn(username);
        turn.run();

        scanner.close();
    }
       
}