package Overworld;

import Overworld.Ezikiel.EzikielRoute;
import Overworld.Foxend.FoxendRoute;
import Overworld.Gombu.GombuRoute;
import Overworld.Human.HumanRoute;

import java.util.Scanner;

public class Overworld {
    public Overworld() {
        Scanner scanner = new Scanner(System.in);
        // TODO with large blocks of text like this, maybe put some Thread.wait(X) calls at pauses
        System.out.println("Walking up the pellucid steps a radiating light engulfs everything around you");
        System.out.println("As a familiar voice reaches out to you saying......");
        System.out.println("......'Awake'!");
        System.out.println("Your journey begins in the Overworld... or so it seems");
        System.out.println("You feel beyond comfortable in this new area, as if you've lived here for eternity");
        System.out.println();
        System.out.println("An anonymous being stands before you");
        System.out.println();
        System.out.println("There are four main races in the overworld:");
        System.out.println();
        System.out.println("Humans, which gather in towns and are the most abundant...");
        System.out.println("- They are known for their ability to adapt to any situation");
        System.out.println();
        System.out.println("Gombu, which are natural to the prairies of the Overworld and are the kindest of any race ");
        System.out.println("- Exquisite craftsman and workers, they can build anything and tear down anything, very resourceful");
        System.out.println();
        System.out.println("Ezikiel, the angelic race being almost completely polar of the Demons");
        System.out.println("- They are known for being the most balanced and well gifted in fighting and persuasion of the races");
        System.out.println();
        System.out.println("And the Foxend, humanoid animal beings that are the least abundant race");
        System.out.println("- Known for their extreme agile and stealthy movements, these beings are very hard to detect, and very lonely and untrusting ");
        System.out.println();
        System.out.println("'Who are you?' it asks... ");
        String decision = scanner.nextLine();
        System.out.println("~~~~~~~~");
        System.out.println();
        System.out.println();
        System.out.println();
        // TODO these should be switch statements
        if (decision.toLowerCase().equals("gombu")) {
            new GombuRoute();
        } else if (decision.toLowerCase().equals("ezikiel")) {
            new EzikielRoute();
        } else if (decision.toLowerCase().equals("human")) {
            new HumanRoute();
        } else if (decision.toLowerCase().equals("foxend")) {
            new FoxendRoute();
        } else {
            System.out.println("Can't you even choose one of the choices your given?");
            System.out.println("Just give up you worthless indecisive maggot unable to make simple choices");
            System.out.println("Oh and here's a little something for you");
            System.out.println("GAME OVER");
        }
    }
}
    

