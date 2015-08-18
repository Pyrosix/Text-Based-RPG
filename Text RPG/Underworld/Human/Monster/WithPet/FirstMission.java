package Underworld.Human.Monster.WithPet;

import Destination.Destination;
import Fantasy.Player;
import Underworld.Human.Monster.WithPet.Forest2.Forest2;
import Underworld.Human.Monster.WithPet.Mountain.Mountain;

import java.util.Scanner;

class FirstMission {
    public FirstMission() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("El smiles mischievously and smacks you on the back, proud that you've decided to take on your first mission");
        System.out.println("He reaches into his jacket and pulls out a black box wrapped in chains and giving off a profuse smell");
        System.out.println("You take it from him, breathing out your mouth as you hold the box at arms length to keep away the stench");
        System.out.println(Player.petName + " screeches and runs behind a pillar away from the box");
        System.out.println("You raise an eyebrow in question at the Draconiz and look back at El'Tuin who is still smiling");
        System.out.println("You ask him what it is that's making " + Player.petName + " so scared");
        System.out.println("El Tells you that it's classified and if he told you you'd automatically fail the mission");
        System.out.println("He says that what he can tell you is that some monsters find the smell revolting, while others will be attracted to it so be careful");
        System.out.println("He says that all you have to do is transport the box to the town three days north and deliver it to the elder");
        System.out.println("He says that if you open the box, the seal will come undone and you will fail");
        System.out.println("If the box is stolen, you fail");
        System.out.println("if you don't get it to the elder within the three days, you fail");
        System.out.println("You start to wonder if this a quest you should take but you know that El won't let you back out now");
        System.out.println("You sigh and ask how exactly he expects you to carry the thing around when monsters can smell it from a mile away");
        System.out.println("El shrugs his shoulders and says you'll have to figure that out yourself.");
        System.out.println("He says " + Player.petName + " will get used to the smell after a while, and it'll help you out in the long run");
        System.out.println("But till then you'll have to fend for yourself...");
        System.out.println();
        System.out.println("DAY 5");
        System.out.println();
        System.out.println("You wake up feeling sore but ready to take on your first major step in becoming a true monster hunter");
        System.out.println("You step outside your door to find " + Player.petName + " staring you in the face");
        System.out.println("It let's out a purr and rubs it's rough beak against your cheek");
        System.out.println("You wince from the stinging, but can't help but smile as you ruffle the feathers that cover the top of it's head");
        System.out.println("As you play with " + Player.petName + " El arrives with your smelly package");
        System.out.println("The time has come for you to begin your journey, strapped with your trusty sword and a worthy companion at your side");
        System.out.println("El hands you the box which you deposit in a bag that hopefully will mask the stench long enough for you to take it to the elder");
        System.out.println("El tells you you have two routes you can take to get to the elder. one leads back into the FOREST but is guaranteed to get you to the elder within the three day time limit");
        System.out.println("Or you can travel through the MOUNTAIN Path which is safer, but is known for bandit encounters");
        System.out.println("Which way would you like to go?");
        System.out.println("Enter Choice:: ");
        String decision = scanner.nextLine();
        System.out.println("~~~~~~~~");
        System.out.println();
        System.out.println();
        System.out.println();
        if (decision.toLowerCase().equals("forest")) {
            // I don't like this
            new Forest2();
        } else if (decision.toLowerCase().equals("mountain")) {
            new Mountain();
        } else if (decision.toLowerCase().equals("neither")) {
            System.out.println("You shake your head at EL and tell him you have a better idea");
            System.out.println("You call out to " + Player.petName + " who soars down from the skies and lands beside you eager to help");
            System.out.println("You secure the bag containing your livelihood and climb aboard the Draconiz");
            System.out.println("You shout at " + Player.petName + " to fly, and take off into the blue sky, El watching from below with an approving smile...");
            System.out.println();
            System.out.println();
            System.out.println("DAY 7");
            System.out.println();
            System.out.println();
            new Destination();
        }
    }
}