package Underworld.Human.monster;

import java.util.Scanner;

public class run {
    
    public void run(){
        String yes = "yes";
        String no = "no";
        Scanner x = new Scanner(System.in);
        System.out.println("Knowing you stand no chance against the creature, you decide to run away and take a different route");
        System.out.println("Night falls and you finally have found your way through the forest");
        System.out.println("You see lights atop a cliff in front of you and guess they are coming from the training school");
        System.out.println("Making your way up the steps, a man holding a torch stops you halfway");
        System.out.println("He asks you what you are doing here, one hand on his sword");
        System.out.println("Do you tell him?");
        System.out.print("Enter choice :: ");
        String c = x.nextLine();
        System.out.println("~~~~~~~~");
        System.out.println();
        System.out.println();
        System.out.println();
        if(c.equals(yes)){
            System.out.println("The man shakes his head and unsheathes his sword, swinging at you");
            System.out.println("He says that you should not be so trusting of a person you had never met before");
            System.out.println("He tells you that his school has no room for those that do not doubt others and chases you down the hill");
            System.out.println("You run as fast as you can away, not looking back and regretting ever making the trip...");
            System.out.println("GAME OVER");
        }
        else if(c.equals(no)){
            accepted a = new accepted();
            a.accepted();
        }
        else{
            System.out.println("CONGRATS YOU INDECIVSIVE MAGGOT");
            System.out.println("GAME OVER");
            
        }
    }
}