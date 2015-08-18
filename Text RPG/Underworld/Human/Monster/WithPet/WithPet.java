package Underworld.Human.Monster.WithPet;

import Fantasy.Choice;
import Fantasy.Decision;
import Fantasy.Player;
import Fantasy.Story;

public class WithPet implements Story {
    @Override
    public void play() {
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
        System.out.println("Enter a name :: ");
        Player.petName = Player.scanner.nextLine();
        System.out.println("~~~~~~~~");
        System.out.println("After finishing your training with El'Tuin, he decides it's time for you to take on your first mission");
        System.out.println("He tells you about the rankings of monster from minion-class to dreadnaught");
        System.out.println("Since it is your first mission, he tells you that you'll be taking on minion class by the name of abgora");
        System.out.println("Before he tells you anymore details, he asks if your willing to take on the quest");
        System.out.println("Are you?");

        Choice yes = new Choice("yes", new FirstMission());
        Choice no = new Choice("no", new FirstMission(), "You tell him that you don't feel like you've trained enough and you don't know if you'll be able to make it\n" +
                "El'Tuin laughs and tells you it's fine\n" +
                "He says that he's been training you harden than any of the other students because you showed potential\n" +
                "But if that's how you feel then he'll train you even harden till you fell like you are\n" +
                "He asks you again a time after and you agree");
        new Decision(new Choice[]{yes, no});
    }
}
