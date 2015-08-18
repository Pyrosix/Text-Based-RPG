package Underworld.Demon;

import Fantasy.Choice;
import Fantasy.Decision;
import Fantasy.Story;

class DemonTraining implements Story {
    @Override
    public void play() {
        System.out.println("You open the left one and are surprised to see two swords, one short crossed over a longer one with draconic scale cloak inside the box");
        System.out.println("The black cloak shimmers brightly in the light from the scales, making it seem almost white");
        System.out.println("You look up at the lord and he nods in approval");
        System.out.println("At least that's what you thought...");
        System.out.println("You are suddenly attacked by a group of humans and goblin servants that had been standing in the room watching you");
        System.out.println("Little time to react, your demonic nature leaks out and your thirst for destruction breaks free");
        System.out.println("You grab the swords inside the box and cut the group down mercilessly, showering the room in blood and gore");
        System.out.println("You slice the bodies up until they are no longer recognizable, just a pile of mauled flesh...");
        System.out.println("Finishing your rampage of destruction, you move to stand in front of the lord, covered in blood");
        System.out.println("You look up at him a lack of emotion on your face as well as his");
        System.out.println("He nods to his attendant next to him who moves forward towards you carrying a book labeled contracts");
        System.out.println("He opens the book and pulls out two pages holding them up in front of you");
        System.out.println("First he asks you if you are willing to sign a job contract before anything else");
        System.out.println("Will you?");

        Choice yes = new Choice("yes", new DemonContract());
        Choice no = new Choice("no", "The demon looks at you with disgust, disapproving your waste of an opportunity\n" +
                "You stand up and turn around as you are surrounded by a group of elite demons\n" +
                "You have no time to react as they envelop you in a pillar of magical fire that melts you down into nothing in an instant\n" +
                "The last thing you see is the bored look of the demon king as he stares at your disintegrating body with little interest");
        new Decision(new Choice[]{yes, no});
    }
}
    

