import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
//
//        System.out.println("You are walking in the forest.");
//
//        String myWeapon;
//        String myArmor;
//
//        myWeapon = "Axe";
//        myArmor = "Leather Tunic";
//
//        System.out.println("Your current weapon is " + myWeapon);
//        System.out.println("Your current armor is " + myArmor);
//
//        int yourHP;
//        yourHP = 10;
//
//        System.out.println("Your current HP is " + yourHP);
//
//        System.out.println("A monster attacked you and gave 4 damage!");
//
//        yourHP -= 4;
//
//        System.out.println("Your current HP is " + yourHP);

        Scanner scanner;
        scanner = new Scanner(System.in);

//        String playerName;
//
//        System.out.println("Please enter your name:");
//
//        playerName = scanner.nextLine();
//
//        System.out.println("Hello " + playerName);

        int number;

        System.out.println("Please enter a number:");

        number = scanner.nextInt();

        System.out.println("The number you typed is " + number);

    }
}
