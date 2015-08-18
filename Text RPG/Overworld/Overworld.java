package Overworld;

import Overworld.Ezikiel.EzikielRoute;
import Overworld.Gombu.GombuRoute;
import Overworld.Foxend.FoxendRoute;
import Overworld.Human.HumanRoute;
import java.util.Scanner;

public class Overworld {
    
    public void Overworld(){
        String foxend = "foxend";
        String human = "human";
        String ezikiel = "ezikiel";
        String gombu = "gombu";
        Scanner z = new Scanner(System.in);
        System.out.println("Walking up the pellucid steps a radiating light engulfs everything around you");
        System.out.println("As a familiar voice reaches out to you saying......");
        System.out.println("......'Awake'!");
        System.out.println("Your journey begins in the Overworld... or so it seems");
        System.out.println("You feel beyond comfortable in this new area, as if you've lived her for eternity");
        System.out.println("");
        System.out.println("An anonymos being stands before you");
        System.out.println("");
        System.out.println("There are four main races in the underworld:");
        System.out.println();
        System.out.println("Humans which gather in towns and are the most abundant...");
        System.out.println("-They are known for their ability to adapt to any situation");
        System.out.println();
        System.out.println("Gombu which are natural to the prairies of Overworld are the kindest of any race ");
        System.out.println("-Exquistite craftsman and workers, they can build anything and tear down anything, very resourceful");
        System.out.println();
        System.out.println("Ezikiel the angelic race being almost completely polar of the Demons");
        System.out.println("-They are known for being the most balanced and well gifted in fighting and persuasion of the races");
        System.out.println();
        System.out.println("And the Foxend, humanoid animal beings that are the least abundant race");
        System.out.println("-Known for their extreme agile and stealthy movements, these beings are very hard to detect, and very lonely and untrusting ");
        System.out.println("'Who are you?' it asks... ");
        String b = z.nextLine();
        System.out.println("~~~~~~~~");
        System.out.println();
        System.out.println();
        System.out.println();     
        if(b.equals(gombu)){
            GombuRoute g = new GombuRoute();
            g.GombuRoute();
        }
        else if(b.equals(ezikiel)){
            EzikielRoute e = new EzikielRoute();
            e.DemonRoute();
        }
        else if(b.equals(human)){
            HumanRoute h = new HumanRoute();
            h.HumanRoute();
        } 
        else if(b.equals(foxend)){
            FoxendRoute f = new FoxendRoute();
            f.FoxendRoute();
        }
        else{
            System.out.println("Can't you even choose one of the choices your given?");
            System.out.println("Just give up you worthless indecisive maggot unable to make simple choices");
            System.out.println("Oh and here's a little something for you");
            System.out.println("GAME OVER");
        }    
    }
}
    

