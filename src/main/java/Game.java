import java.util.Scanner;

public class Game {
    Scanner scanner;
    int playerHP;
    String playerName;
    String playerWeapon;
    int choice;
    public static void main(String[] args) {
        Game game;
        game = new Game();
        game.playerSetUp();
        game.townGate();

    }

    public void playerSetUp(){

        playerHP = 10;
        playerWeapon = "Knife";

        System.out.println("Your HP: " + playerHP);
        System.out.println("Your weapon: " + playerWeapon);

        scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        playerName = scanner.nextLine();

        System.out.println("Hello " + playerName + ", let's start your adventure!");
    }

    public void townGate(){

        System.out.println("**************************************************************");
        System.out.println("\nYou are at the gate of the town.");
        System.out.println("A guard is standing in front of you.");
        System.out.println("\nWhat do you want to do?");
        System.out.println("\n1: Talk to the guard");
        System.out.println("2: Attack the guard");
        System.out.println("3: Leave");

        choice = scanner.nextInt();

        if (choice == 1){
            System.out.println("Guard: Hello there stranger.");
        }

        if (choice == 2) {
            System.out.println("Guard: What the hell!? You fought bravely, but the guard was stronger.\nHe killed you.\n\nGAME OVER");
        }

    }

}
