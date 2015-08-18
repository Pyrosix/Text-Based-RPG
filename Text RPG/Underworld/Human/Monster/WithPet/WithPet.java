package Underworld.Human.Monster.WithPet;

import Fantasy.Player;

import java.util.Scanner;

public class WithPet {
    public WithPet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Feeling sorry for the creature, you scale the cliff to help it");
        System.out.println("You untangle the vines encircling it's leg and it takes off crying out in delight");
        System.out.println("You feel refreshed as you walk back towards the school ready to fall asleep");
        System.out.println();
        System.out.println("DAY 4");
        System.out.println();
        System.out.println("You wake up the next day ready for another day of training");
        System.out.println("As you are walking out into the courtyard to meet with El'Tuin for training...");
        System.out.println("You hear a familiar cry and look up to see the bird-like creature you rescued circling above");
        System.out.println("It lands in front of you and nuzzles its beak against the side of your face");
        System.out.println("El'Tuin walks up to you amazed");
        System.out.println("He tells you that the bird is a member of the Draconiz Species, a cross between a bird and a dragon");
        System.out.println("The Draconiz looks at you with its slitted eyes, and purrs");
        System.out.println("El'Tuin tells you that your lucky to have made a friend out of one since they are very rare to see");
        System.out.println("They are very strong creatures that could level a town by themselves");
        System.out.println("The Draconiz follows you around for most of the day, showing no sign of leaving your side");
        System.out.println("You decide to keep as a pet since you doubt it will leave peacefully");
        System.out.println("(Since The Draconiz is yours now, what would you like to name it)");
        System.out.println("Enter a name:: ");
        Player.petName = scanner.nextLine();
        System.out.println("~~~~~~~~");
        System.out.println("After finishing your training with El'Tuin, he decides it's time for you to take on your first mission");
        System.out.println("He tells you about the rankings of monster from minion-class to dreadnaught");
        System.out.println("Since it is your first mission, he tells you that you'll be taking on minion class by the name of abgora");
        System.out.println("Before he tells you anymore details, he asks if your willing to take on the quest");
        System.out.println("Are you?");
        System.out.print("Enter Choice :: ");
        String decision = scanner.nextLine();
        System.out.println("~~~~~~~~");
        System.out.println();
        System.out.println();
        System.out.println();
        if (decision.toLowerCase().equals("yes")) {
            new FirstMission();
        } else if (decision.toLowerCase().equals("no")) {
            System.out.println("You tell him that you don't feel like you've trained enough and you don't know if you'll be able to make it");
            System.out.println("El'Tuin laughs and tells you it's fine");
            System.out.println("He says that he's been training you harden than any of the other students because you showed potential");
            System.out.println("But if that's how you feel then he'll train you even harden till you fell like you are");
            System.out.println("He asks you again a time after and you agree");
            new FirstMission();
        } else {
            System.out.println("Can't you even choose one of the choices your given?");
            System.out.println("Just give up you maggot unable to follow directions");
            System.out.println("Oh and here's a little something for you");
            System.out.println("GAME OVER");
        }
    }
}
