package Underworld.Human.monster;


import fantasy.fantasy;
import java.util.Scanner;
public class accepted {
    
    public void accepted(){
        String yes = "yes";
        String no = "no";
        String idk = "i don't remember";
        Scanner x = new Scanner(System.in);
        System.out.println("The man smiles at you and reaches out his hand to shake yours");
        System.out.println("He says it was the right decision not to trust him so easily and congratulates you for making it throught the forest alive");
        System.out.println("He introduces hismelf as El'tuin the owner of the school");
        System.out.println("You tell him your name is " + fantasy.y + " and show him the flier");
        System.out.println("He says that he doesn't need it as he's decided to admit you into the school no cost");
        System.out.println("He puts an arm around your shoulder as he leads you inside");
        System.out.println("El'Tuin tells you the story of how he became a Monster Hunter and why he founded a shool");
        System.out.println("He sees that you are tired after walking all day long through the forest and shows you to what will be your room from that point on");
        System.out.println("He tells you to meet him in the courtyard in the morning then walks away after handing you the key and closing the door");
        System.out.println();
        System.out.println("DAY 3");
        System.out.println();
        System.out.println("You wake up the next morning and look out the window above your bed");
        System.out.println("You can see the forest down below which looks a lot less mencecing from above"); 
        System.out.println("You look up at the eternally grey sky wondering what is in store for you today");
        System.out.println("You get dressed then make your way outside to the courtyard like you were instructed");
        System.out.println("El'Tuin stands in the middle of the courtyard his hands on the hilt of his sword which was embedded in the ground");
        System.out.println("You greet him and ask him what he had planned for the day");
        System.out.println("He tells you that he is going to teachyou how to use the sword strapped to your waist");
        System.out.println("He asks if you have any combat experience beforehand");
        System.out.println("Do you?");
        System.out.print("Enter choice :: ");
        String p = x.nextLine();
        System.out.println("~~~~~~~~");
        System.out.println();
        System.out.println();
        System.out.println();
        if(p.equals(yes)){
            System.out.println("Sounding impressed, El'tuin charges at you wanting to test your skills");
            System.out.println("You, not having any combat experience, are caught off guard by the sudden attack and are mortal wounded");
            System.out.println("You stare up at the sky, blood flowing out of your wound as you lay on the ground, regretting your cocky decision....");
            System.out.println("GAME OVER");
        }
        else if(p.equals(no)){
            System.out.println("You tell him you have no previous combat experience");
            System.out.println("El'Tuin laughs and tells you it's fine since he was planning to teach you his techniques even if you did");
            training t = new training();
            t.training();
        }
        else if(p.equals(idk)){
            System.out.println("You tell him that you don't know due to not remembering who you are");
            System.out.println("El'Tuin laughs and tells you that it doesn't matter because he's going to teach you either way");
            training t = new training();
            t.training();
        }
        else{
            System.out.println("Can't you even choose one of the choices your given?");
            System.out.println("Just give up you maggot unable to follow directions");
            System.out.println("Oh and here's a little something for you");
            System.out.println("GAME OVER");
        }
    }
}
