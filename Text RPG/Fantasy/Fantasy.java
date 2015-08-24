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

        Choice down = new Choice("down", new Underworld());
        Choice up = new Choice("up", new Overworld());
        new Decision(new Choice[]{down, up}, "You were too confused to choose either way and missed your chance to go either way\n" +
                "You watch in horror as both sets of stairs disappear, leaving you in complete nothingness with nowhere to go....");
    }
}
