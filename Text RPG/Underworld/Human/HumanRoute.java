package Underworld.Human;


import java.util.Scanner;

public class HumanRoute {
    
    public void HumanRoute(){
        String yes = "yes";
        String no = "no";
        Scanner x = new Scanner(System.in);
        System.out.println();
        System.out.println("Day 1");
        System.out.println();
        System.out.println("You are now a human, one with high intellect and the ability to adapt to any situation");
        System.out.println("You find yourself in a highly populated town, nothing with you but the clothes on your body");
        System.out.println("a plan white tunic and brown pants");
        System.out.println("As you are walking down the street, you pass by an armor and weapons shop and decide to take a look inside");
        System.out.println("The walls are covered in displays carrying an assortment of different shapes and sizes of armor");
        System.out.println("A glass case of weapons sits in the back of the shop lining the wall");
        System.out.println("what looks to be the shopkeeper is sitting on a stool, leaning against the case");
        System.out.println("The shopkeeper stands up as you enter and walks over to you asking if he can help you with anything");
        System.out.println("Can he?");
        System.out.print("Enter Choice :: ");
        String y = x.nextLine();
        System.out.println("~~~~~~~~");
        System.out.println();
        System.out.println();
        System.out.println();
        if(y.equals(yes)){
            System.out.println("The shopkeeper shows you a set of armor and a sword that he thinks would fit you well");
            System.out.println("He says there's something about you that he likes and decides to give it to you for free");
            System.out.println("You thank him and take the armor and the sword, changing before walking out, the sword strapped to your waist");
            AfterArmor a = new AfterArmor();
            a.AfterArmor();
        }
        else if(y.equals(no)){
            System.out.println("The shopkeeper says to come talk to him when you are done looking around");
            System.out.println("You look around for a bit but can't figure out what's good and walk out without buying anything");
            System.out.println("Without any protection you stick out in the city and become a target for a robbery ");
            System.out.println("They beat you to death and take what little you have, leaving your dead body to rot in an alleyway...");
            System.out.println("GAME OVER");
        }
        else{
            System.out.println("Can't you even choose one of the choices your given?");
            System.out.println("Just give up you worthless indecisive maggot unable to make simple choices");
            System.out.println("Oh and here's a little something for you");
            System.out.println("GAME OVER");
        }
    }
}   
