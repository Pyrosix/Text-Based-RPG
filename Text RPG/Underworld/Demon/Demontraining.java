/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Underworld.Demon;

import java.util.Scanner;

/**
 *
 * @author Pyro
 */
public class Demontraining {

   public void Demontraining(){
        String yes = "yes";
        String no = "no";
        Scanner x = new Scanner(System.in);
        System.out.println("You open the left one and are surprised to see two swords, one short crossed over a longer one with dracon scale cloak inside the box");
        System.out.println("The black cloak shimmers brightly in the light from the scales, making it seem almost white");
        System.out.println("You look up at the lord and he nods in approval");
        System.out.println("Atleast that's what you thought...");
        System.out.println("You are suddenly attacked by a group of humans and goblin servents that had been standing in the room watching you");
        System.out.println("Little time to react, your demonic nature leaks out and your thirst for destruction breaks free");
        System.out.println("You grab the swords inside the box and cut the group down mercilessly, showering the room in blood and gore");
        System.out.println("You slice the bodies up until they are no longer recognizable, just a pile of mauled flesh...");
        System.out.println("Finishing your rampage of destruction, you move to stand in front of the lord, covered in blood");
        System.out.println("You look up at him a lack of emotion on your face as well as his");
        System.out.println("He nods to his attendent next to him who moves forward towards you carrying a book labeled contracts");
        System.out.println("He opens the book and pulls out two pages holding them up in front of you");
        System.out.println("First he asks you if you are willing to sign a job contract  before anything else");
        System.out.println("Will you?");
        System.out.print("Enter Choice :: ");
       String y = x.nextLine();
        System.out.println("~~~~~~~~");
        if(y.equals(yes)){
            System.out.println("The attendent nods in approval and says that you've made the right decision");
            System.out.println("The demon then thanks you and explains the deal");

            Demoncontract a = new Demoncontract();
            a.Demoncontract();
        }
        else if(y.equals(no)){
            System.out.println("the demon looks at you with disgust, disapproving your waste of an opportunity");
            System.out.println("You stand up and turn around as you are surrounded by a group of elite demons");
            System.out.println("You have no time to react as they envelop you in a pillar of magical fire that melts you down into nothing in an instant");
            System.out.println("The last thing you see is the bored look of the demon king as he stares at your disintegrating body with little interest");
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
    

