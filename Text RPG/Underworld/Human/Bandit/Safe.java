package Underworld.Human.Bandit;

import Fantasy.Choice;
import Fantasy.Decision;
import Fantasy.Story;

public class Safe implements Story {
    @Override
    public void play() {
        System.out.println("you decide to take the safe route and a day later half way to the monster hunting school you are suddenly attacked by bandits");
        System.out.println("Not having any fighting experience what so ever, you simply throw a half-assed punch");
        System.out.println("The bandits seeing you can't fight laugh and easily knocking you out");
        System.out.println();
        System.out.println("DAY 3");
        System.out.println();
        System.out.println("All you see is absolute darkness when you regain consciousness you can't tell where you are or how long you have been out but...");
        System.out.println("Suddenly you hear a metallic old screeching sound as a metal door opens and a wave of bright light blinds you");
        System.out.println("your instincts quickly take over and you shield your eyes squinting them to get a glimpse of a tall and covered figure");
        System.out.println("The figure stands at the door two armed bandits stand behind her out view");
        System.out.println("She explains in a eloquent yet ragged voice that she took a liking to his spunk and spared his life on one condition");
        System.out.println("you think to yourself how in the not so good lord's name did you get yourself into this mess");
        System.out.println("She then steps closer no more of her visible than before she is covered head to toe obscuring her features");
        System.out.println("Obviously seeing that she wants to say something further you ask what the condition is hesitantly");
        System.out.println("Faced with almost absolute death with a slim chance to live or a life of thievery and possible adventure you have a decision to make");
        System.out.println("The bandit leader gives you two choices die in the deathworm pits or join her bandits and learn their ways");
        System.out.println("Will you join them....?");
        System.out.println("Or will you die...?");

        Choice join = new Choice("join", new Bandit());
        Choice die = new Choice("die", "You refuse her offer and say you'd rather die than be a stupid bandit\n" +
                "You are then harshly punched by the bandit leader and dragged out by the two armed bandits\n" +
                "Passing through long stony corridors you are suddenly stopped and stood up facing a small door\n" +
                "The little door opens seemingly on its own and you are thrown full force into a gulping darkness and for moments you feel no ground\n" +
                "Moments later you hear ungodly screams that you soon realize our yours as you are being torn apart limb by fragile limb\n" +
                "Your life fades from your torn and eaten body left lifeless and cold as dinner meat....");
        new Decision(new Choice[]{join, die});
    }
}


