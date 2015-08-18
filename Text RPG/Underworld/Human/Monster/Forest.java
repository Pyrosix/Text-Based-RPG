package Underworld.Human.Monster;

import Fantasy.Choice;
import Fantasy.Decision;
import Fantasy.Story;

public class Forest implements Story {
    @Override
    public void play() {
        System.out.println("You enter the forest, the sounds of the wildlife circling around you");
        System.out.println("As you walk through, you come to a clearing occupied with a creature you have never seen before");
        System.out.println("It resembles a green pile of goo almost as tall as you are");
        System.out.println("The creature hasn't noticed you so you can do two things;");
        System.out.println("You can run...");
        System.out.println("Or you can fight...");

        Choice fight = new Choice("fight", "Steeling your will, you decide to prove your dominance by fighting the creature\n" +
                "You panic as the sword goes into the creature and gets stuck\n" +
                "The creature notices you and begins to suck you inside itself\n" +
                "You struggle to break free, but the pull is too strong and you are sucked inside the creatures gooey body\n" +
                "There is no air inside, and you struggle for breath before suffocating and being dissolved down to your bones...");
        Choice run = new Choice("run", new Run());
        new Decision(new Choice[]{fight, run});
    }
}