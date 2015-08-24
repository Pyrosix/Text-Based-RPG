package Underworld;

import Fantasy.Choice;
import Fantasy.Decision;
import Fantasy.Story;
import Underworld.Demon.DemonRoute;
import Underworld.Goblin.GoblinRoute;
import Underworld.Human.HumanRoute;

public class Underworld implements Story {
    @Override
    public void play() {
        System.out.println("You walk down the black stairs, a light blinding you as you walk through a portal of sorts");
        System.out.println("You look up to see a red sun surrounded by a grey sky");
        System.out.println("WELCOME TO THE UNDERWORLD");
        System.out.println();
        System.out.println("The Underworld is a dark and gloomy place...");
        System.out.println("Law and order hold no power here as the citizens are free to do as they wish...");
        System.out.println("The only way to protect yourself down here is by being stronger than everyone else....");
        System.out.println("You find yourself in front of a mirror...");
        System.out.println("looking into it, you see what you look like for the first time");
        System.out.println("There are three main races in the underworld:");
        System.out.println();
        System.out.println("Humans, which gather in towns and are the most abundant...");
        System.out.println("- They are known for their ability to adapt to any situation");
        System.out.println();
        System.out.println("Goblins, which live in the wilds, civilized yet extremely dangerous...");
        System.out.println("- They are known for there small bodies able to move quietly in any situation");
        System.out.println();
        System.out.println("And Demons, which live in the upper parts of the underworld and are the most influential race...");
        System.out.println("- They are known for being the most powerful of the races");
        System.out.println();
        System.out.println("What race are you?");

        Choice goblin = new Choice("goblin", new GoblinRoute());
        Choice demon = new Choice("demon", new DemonRoute());
        Choice human = new Choice("human", new HumanRoute());
        new Decision(new Choice[]{goblin, demon, human});
    }
}