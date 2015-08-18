package Underworld;


import Underworld.Demon.DemonRoute;
import Underworld.Goblin.GoblinRoute;
import Underworld.Human.HumanRoute;
import java.util.Scanner;

public class Underworld {
    
 public void Underworld(){
    String demon = "demon";
    String human = "human";
    String goblin = "goblin";
    Scanner x = new Scanner(System.in);
    System.out.println("You walk down the black stairs, a light blinding you as you walk through a portal of sorts");
    System.out.println("You look up to see a red sun surrounded by a grey sky");
    System.out.println("WELCOME TO THE UNDERWORLD");
    System.out.println("");
    System.out.println("The Underworld is a dark and gloomy place...");
    System.out.println("Law and order hold no power here as the citizens are free to do as they wish...");
    System.out.println("The only way to protect yourself down here is by being stronger than everyone else....");
    System.out.println("You find yourself in front of a mirror..."); 
    System.out.println("looking into it, you see what you look like for the first time");
    System.out.println("There are three main races in the underworld:");
    System.out.println();
    System.out.println("HUMANs which gather in towns and are the most abundant...");
    System.out.println("-They are known for their ability to adapt to any situation");
    System.out.println();
    System.out.println("GOBLINs which live in the wilds, civilized yet extremely dangerous...");
    System.out.println("-They are known for there small bodies able to move quietly in any situation");
    System.out.println();
    System.out.println("And DEMONs which live in the upper parts of the underworld and are the most influiential race...");
    System.out.println("-They are known for being the most powerful of the races");
    System.out.println();
    System.out.println("What race are you?");
    System.out.print("Enter Race :: ");
    String r = x.nextLine();
    System.out.println("~~~~~~~~");
    System.out.println();
    System.out.println();
    System.out.println();
    if(r.equals(goblin)){
        GoblinRoute g = new GoblinRoute();
        g.GoblinRoute();
    }
    else if(r.equals(demon)){
        DemonRoute d = new DemonRoute();
        d.DemonRoute();
    }
    else if(r.equals(human)){
        HumanRoute h = new HumanRoute();
        h.HumanRoute();
    }
    else{
         System.out.println("Can't you even choose one of the choices your given?");
         System.out.println("Just give up you maggot unable to follow directions");
         System.out.println("Oh and here's a little something for you");
         System.out.println("GAME OVER");
    }
        
    
 }
}