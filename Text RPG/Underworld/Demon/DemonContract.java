package Underworld.Demon;

import Fantasy.Choice;
import Fantasy.Decision;
import Fantasy.Story;

class DemonContract implements Story {
    @Override
    public void play() {
        System.out.println("The attendant nods in approval and says that you've made the right decision");
        System.out.println("The demon then thanks you and explains the deal");
        System.out.println();
        System.out.println("The first contract involves recovering some weapons and armor that were stolen by hi-goblins");
        System.out.println("He says that you will be rewarded with whatever you wish from the weapons you recover");
        System.out.println("The second contract requires complete stealth");
        System.out.println("You are to infiltrate a demon nobles mansion, and find proof that he plans to overthrow the lord");
        System.out.println("He says you will be rewarded with the nobles position, which means an evolution into a hi-demon");
        System.out.println("He asks you to choose wisely since they will both affect your future position");
        System.out.println("You will become either a spy or a warrior");
        System.out.println("Which contract will you choose?");
        System.out.println("The RECOVERY....?");
        System.out.println("Or the INFILTRATION....?");

        Choice recovery = new Choice("recovery", new WeaponRecovery());
        Choice infiltration = new Choice("infiltration", new Infiltration());
        new Decision(new Choice[]{recovery, infiltration});
    }
}
