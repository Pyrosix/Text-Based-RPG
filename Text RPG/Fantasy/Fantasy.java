package Fantasy;

import Overworld.Overworld;
import Underworld.Underworld;

import java.util.Scanner;

public class Fantasy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO move text outside of classes
        System.out.println("You are a lost soul....");
        System.out.println("With no memory of your past....");
        System.out.println("All you remember is your name....");
        System.out.println("What is your name?....");
        System.out.print("Enter your name :: ");
        Player.playerName = scanner.nextLine();
        System.out.println("~~~~~~~~");
        System.out.println(Player.playerName + "..... ah yes that's what it was....");
        System.out.println("You find yourself at a set of black and white stairs....");
        System.out.println("You can only choose one way or the other....");
        System.out.println("Which way would you like to go?");
        System.out.println("DOWN the black stairs, filled with despair, which lead to the Underworld?");
        System.out.println("Or UP the white stairs, radiating hope, that lead to the Overworld?");
        System.out.print("Enter choice :: ");
        String decision = scanner.nextLine();
        System.out.println("~~~~~~~~");
        System.out.println();
        System.out.println();
        System.out.println();
        // TODO make a class for input validation that doesn't end the game when input is invalid
        if (decision.toLowerCase().equals("down")) {
            new Underworld();
        } else if (decision.toLowerCase().equals("up")) {
            new Overworld();
        } else {
            System.out.println("You were too confused to choose either way and missed your chance to go either way");
            System.out.println("You watch in horror as both sets of stairs disappear, leaving you in complete nothingness with nowhere to go....");
            System.out.println("GAME OVER");
        }
    }
}
