import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in);
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
        System.out.println("\n**************************************************************");

        choice = scanner.nextInt();

        if (choice == 1){
            System.out.println("Guard: Hello there stranger. So your name is " + playerName + "? \nSorry but we cannot let stranger enter our town.");
            enterScanner.nextLine();
            townGate();
        }
        if (choice == 2) {
            playerHP = playerHP-1;
            System.out.println("Guard: Hey don't be stupid.\nThe guard hit you so hard and you gave up.\n(You receive 1 damage)");
            System.out.println("Your HP: " + playerHP);
            enterScanner.nextLine();
            townGate();
        }
        if (choice == 3) {
            crossRoad();
        }
        else {
            townGate();
        }
    }

    public void crossRoad(){
        System.out.println("**************************************************************");
        System.out.println("You are at a crossroad. If you go south, you will go back to the town.\n");
        System.out.println("1: Go North");
        System.out.println("2: Go East");
        System.out.println("3: Go South");
        System.out.println("4: Go West");
        System.out.println("**************************************************************");

        choice = scanner.nextInt();

        if (choice == 1) {
            north();
        }
        if (choice == 2) {
            east();
        }
        if (choice == 3) {
            townGate();
        }
        if (choice == 4) {
            west();
        }
        else {
            crossRoad();
        }
    }

    public void north(){

    }

    public void east(){

    }

    public void west(){

    }

}
