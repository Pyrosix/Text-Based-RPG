package Underworld.Human;

import Underworld.Human.Bandit.Safe;
import Underworld.Human.Monster.Forest;

import java.util.Scanner;

class AfterArmor {

    public AfterArmor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You leave the shop and see a group of men out the corner of your eye unaware that they had been watching you since you appeared");
        System.out.println("After seeing you come out in Armor and with a weapon, they walk off not wanting to get involved with you");
        System.out.println("As you walk through the city, you grow tired and decide to stop at an inn");
        System.out.println("The innkeeper sees you in your armor and guesses you are an important person since armor is expensive");
        System.out.println("He decides to let you stay for free, being extremely polite");
        System.out.println("You thank him and make your way to your designated room, falling asleep almost immediately after laying down");
        System.out.println();
        System.out.println("DAY 2");
        System.out.println();
        System.out.println("You wake up the next morning feeling rested and ready to look around");
        System.out.println("As you are walking through the city, you notice a crowd of people gathered around a man dressed in extremely bulky armor a helmet covering his face");
        System.out.println("A giant axe as wide as you are leans against the wall beside him");
        System.out.println("The man is handing out fliers for a free trial at his monster hunter training school");
        System.out.println("You take one, thinking it might come in handy");
        System.out.println("After looking around for a bit longer, you decide to leave the city and make your way to the training school you had heard about");
        System.out.println("You leave the city and come to a crossroad");
        System.out.println("The left gravel road is the trade route that will take you two days to reach your destination");
        System.out.println("The right road goes into the forest filled with monsters, but will only take you a day to get through");
        System.out.println("Which way would you like to go?");
        System.out.println("The SAFE way or through the FOREST?");
        System.out.print("Enter Choice :: ");
        String decision = scanner.nextLine();
        System.out.println("~~~~~~~~");
        System.out.println();
        System.out.println();
        System.out.println();
        if (decision.toLowerCase().equals("safe")) {
            new Safe();
        } else if (decision.toLowerCase().equals("forest")) {
            new Forest();
        } else {
            System.out.println("Can't you even choose one of the choices your given?");
            System.out.println("Just give up you maggot unable to follow directions");
            System.out.println("Oh and here's a little something for you");
            System.out.println("GAME OVER");
        }
    }
}
