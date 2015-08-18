package Underworld.Demon;

import java.util.Scanner;

public class DemonRoute {
    public DemonRoute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Day One");
        System.out.println();
        System.out.println("you see your new demonic appearance in the mirror in front of you, teaming with power");
        System.out.println("Your red skin sticks out like a sour thumb and your slitted eyes would make anything run in fear");
        System.out.println("You wear nothing but a pair of black pants that have a hole for your pointed tail to stick out");
        System.out.println("Your story begins in the demon lords audience hall");
        System.out.println("A place that all newly born demons start off");
        System.out.println("In front of you lies two boxes of similar shape and height");
        System.out.println("You know that one holds a weapon of great power");
        System.out.println("And the other holds something able to end your life in a second");
        System.out.println("You have been told to pick one");
        System.out.println("Which do you choose?");
        System.out.println("The RIGHT one...?");
        System.out.println("Or the LEFT one...?");
        System.out.print("Enter Choice :: ");
        String direction = scanner.nextLine();
        System.out.println("~~~~~~~~");
        if (direction.toLowerCase().equals("left")) {
            new DemonTraining();
        } else if (direction.toLowerCase().equals("right")) {
            System.out.println("You open the right one slowly");
            System.out.println("Flames hotter than anything you have ever experienced before burst out in a column");
            System.out.println("you catch fire instantly and whither in pain, unable to put it out ");
            System.out.println("The screaming stops as your body turns to ash, swept up and thrown away without a second thought");
            System.out.println("GAME OVER");
        } else {
            System.out.println("Can't you even choose one of the choices your given?");
            System.out.println("Just give up you worthless indecisive maggot unable to make simple choices");
            System.out.println("Oh and here's a little something for you");
            System.out.println("GAME OVER");
        }
    }
}