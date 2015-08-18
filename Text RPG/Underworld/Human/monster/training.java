package Underworld.Human.monster;



import Underworld.Human.monster.withpet.WithPet;
import Underworld.Human.monster.withoutpet.WithoutPet;
import java.util.Scanner;
public class training {
    
    public void training(){
        String yes = "yes";
        String no = "no";
        Scanner x = new Scanner(System.in);
        System.out.println("He tells you to take out your sword and hold it in a way most comfortable to you");
        System.out.println("For the rest of the day you and El'Tuin spend the entire time sparring");
        System.out.println("He praises you for being an extremely fast learner, able to grasp everything he teaches you");
        System.out.println("The day ends and you are walking around the perimeter of the school when you here a cry of some sort");
        System.out.println("You run to go see what it is and find a giant bird-like creature of sorts trapped in the vines on the cliff side");
        System.out.println("You feel sorry for the creature but don't know if you should help it since the cliff hangs over the sea");
        System.out.println("Should you help the creature?");
        System.out.print("Enter Choice :: ");
        String l = x.nextLine();
        System.out.println("~~~~~~~~");
        System.out.println();
        System.out.println();
        System.out.println();
        if(l.equals(no)){
            WithoutPet w = new WithoutPet();
            w.WithoutPet();
        }
        else if(l.equals(yes)){
            WithPet p = new WithPet();
            p.WithPet();
        }
        else{
            System.out.println("Can't you even choose one of the choices your given?");
            System.out.println("Just give up you maggot unable to follow directions");
            System.out.println("Oh and here's a little something for you");
            System.out.println("GAME OVER");
        }
    }
}
