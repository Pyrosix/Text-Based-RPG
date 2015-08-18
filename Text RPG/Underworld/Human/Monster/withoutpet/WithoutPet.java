package Underworld.Human.Monster.withoutpet;

import java.util.Scanner;

public class WithoutPet {
    public WithoutPet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Feeling sorry for the creature but not wanting to take a chance at getting hurt, you leave it alone to fend for itself");
        System.out.println("You make your way back to your room where you fall onto your bed with a sigh");
        System.out.println("You hope someone went out and help the bird, a small sense of guilt present in your stomach as you fall asleep");
        System.out.println();
        System.out.println("DAY 4");
        System.out.println();
        System.out.println("You wake up the next day ready for another day of training");
        System.out.println("You haven't forgotten about the bird, so before going to meet El'Tuin you head to the cliff side");
        System.out.println("You see that the bird is gone and guess that someone else managed to gather the courage to free it");
        System.out.println("You go to meet El'Tuin with a clear mind");
        System.out.println("After finishing your training with El'Tuin, he decides it's time for you to take on your first mission");
        System.out.println("He tells you about the rankings of monster from minion-class to dreadnaught");
        System.out.println("Since it is your first mission, he tells you that you'll be taking on minion class by the name of abgora");
        System.out.println("Before he tells you anymore details, he asks if your willing to take on the quest");
        System.out.println("Are you?");
        System.out.print("Enter Choice :: ");
        String decision = scanner.nextLine();
        System.out.println("~~~~~~~~");
        if (decision.toLowerCase().equals("yes")) {
            new FirstMission2();
        } else if (decision.toLowerCase().equals("no")) {
            System.out.println("You tell him that you don't feel like you've trained enough and you don't know if you'll be able to make it");
            System.out.println("El'Tuin laughs and tells you it's fine");
            System.out.println("He says that he's been training you harden than any of the other students because you showed potential");
            System.out.println("But if that's how you feel then he'll train you even harden till you fell like you are");
            System.out.println("He asks you again a time after and you agree");
            new FirstMission2();
        } else {
            System.out.println("Can't you even choose one of the choices your given?");
            System.out.println("Just give up you maggot unable to follow directions");
            System.out.println("Oh and here's a little something for you");
            System.out.println("GAME OVER");
        }
    }
}

