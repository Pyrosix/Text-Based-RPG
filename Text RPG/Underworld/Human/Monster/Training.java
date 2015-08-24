package Underworld.Human.Monster;

import Fantasy.Choice;
import Fantasy.Decision;
import Fantasy.Story;
import Underworld.Human.Monster.WithPet.WithPet;
import Underworld.Human.Monster.withoutpet.WithoutPet;

class Training implements Story {
    @Override
    public void play() {
        System.out.println("He tells you to take out your sword and hold it in a way most comfortable to you");
        System.out.println("For the rest of the day you and El'Tuin spend the entire time sparring");
        System.out.println("He praises you for being an extremely fast learner, able to grasp everything he teaches you");
        System.out.println("The day ends and you are walking around the perimeter of the school when you here a cry of some sort");
        System.out.println("You run to go see what it is and find a giant bird-like creature of sorts trapped in the vines on the cliff side");
        System.out.println("You feel sorry for the creature but don't know if you should help it since the cliff hangs over the sea");
        System.out.println("Should you help the creature?");

        Choice no = new Choice("no", new WithoutPet());
        Choice yes = new Choice("yes", new WithPet());
        new Decision(new Choice[]{no, yes});
    }
}
