package Underworld.Demon;

import java.util.Scanner;

class DemonContract {

    public DemonContract() {
        Scanner scanner = new Scanner(System.in);
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
        System.out.print("Enter Choice :: ");
        String decision = scanner.nextLine();
        System.out.println("~~~~~~~~");
        if (decision.toLowerCase().equals("recovery")) {
            new WeaponRecovery();
        } else if (decision.toLowerCase().equals("infiltration")) {
            new Infiltration();
        } else {
            System.out.println("Can't you even choose one of the choices your given?");
            System.out.println("Just give up you worthless indecisive maggot unable to make simple choices");
            System.out.println("Oh and here's a little something for you");
            System.out.println("GAME OVER");
        }
    }


}
