import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Game game;
        game = new Game();
        game.playerSetUp();

    }

    public void playerSetUp(){
        int playerHP;
        playerHP = 15;

        String playerWeapon;
        playerWeapon = "Knife";

        System.out.println("Your HP: " + playerHP);
        System.out.println("Your weapon: " + playerWeapon);

        String playerName;

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        playerName = scanner.nextLine();

        System.out.println("Hello " + playerName + ", let's start your adventure!");

    }

}
