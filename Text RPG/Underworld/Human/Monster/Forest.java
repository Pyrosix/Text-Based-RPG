package Underworld.Human.Monster;

import java.util.Scanner;

public class Forest {
    public Forest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You enter the forest, the sounds of the wildlife circling around you");
        System.out.println("As you walk through, you come to a clearing occupied with a creature you have never seen before");
        System.out.println("It resembles a green pile of goo almost as tall as you are");
        System.out.println("The creature hasn't noticed you so you can do two things;");
        System.out.println("You can run...");
        System.out.println("Or you can fight...");
        System.out.print("Enter choice :: ");
        String decision = scanner.nextLine();
        System.out.println("~~~~~~~~");
        System.out.println();
        System.out.println();
        System.out.println();
        if (decision.toLowerCase().equals("fight")) {
            System.out.println("Steeling your will, you decide to prove your dominance by fighting the creature");
            System.out.println("You panic as the sword goes into the creature and gets stuck");
            System.out.println("the creature notices you and begins to suck you inside itself");
            System.out.println("You struggle to break free, but the pull is too strong and you are sucked inside the creatures gooey body");
            System.out.println("There is no air inside, and you struggle for breath before suffocating and being dissolved down to your bones...");
            System.out.println("GAME OVER");
        } else if (decision.toLowerCase().equals("run")) {
            new Run();
        } else {
            System.out.println("You were frozen by fear and before you could choose the creature noticed you");
            System.out.println("It bounded over to you, devouring you and spitting you bones out after dissolving you completely....");
            System.out.println("GAME OVER");
        }
    }
}