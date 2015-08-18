package Underworld.Human.Monster;

import Fantasy.Choice;
import Fantasy.Decision;
import Fantasy.Story;

class Run implements Story {
    @Override
    public void play() {
        System.out.println("Knowing you stand no chance against the creature, you decide to run away and take a different route");
        System.out.println("Night falls and you finally have found your way through the forest");
        System.out.println("You see lights atop a cliff in front of you and guess they are coming from the training school");
        System.out.println("Making your way up the steps, a man holding a torch stops you halfway");
        System.out.println("He asks you what you are doing here, one hand on his sword");
        System.out.println("Do you tell him?");

        Choice yes = new Choice("yes", "The man shakes his head and unsheathes his sword, swinging at you\n" +
                "He says that you should not be so trusting of a person you had never met before\n" +
                "He tells you that his school has no room for those that do not doubt others and chases you down the hill\n" +
                "You run as fast as you can away, not looking back and regretting ever making the trip...");
        Choice no = new Choice("no", new Accepted());
        new Decision(new Choice[]{yes, no});
    }
}
