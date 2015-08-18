package Fantasy;

import java.util.Scanner;

public class Decision {
    private static Scanner scanner = new Scanner(System.in);

    private String gameOver;

    public Decision(Choice[] choices) {
        decide(choices);
    }

    public Decision(Choice[] choices, String gameOver) {
        this.gameOver = gameOver;
        decide(choices);
    }

    private void decide(Choice[] choices) {
        // Would it be okay to list the choices? Or is that against the feel of the game?
        System.out.println("Enter Choice :: ");
        String decision = scanner.nextLine().toLowerCase().trim();
        System.out.println("~~~~~~~~");
        System.out.println();
        System.out.println();
        System.out.println();
        boolean playing = false;
        for (Choice choice : choices) {
            if (decision.equals(choice.name.toLowerCase())) {
                choice.play();
                playing = true;
            }
        }
        if (!playing) {
            if(gameOver != null) {
                System.out.println(gameOver);
            } else {
                // TODO add other default game over texts, choose one at random
                System.out.println("Can't you even choose one of the choices your given?");
                System.out.println("Just give up you maggot unable to follow directions");
                System.out.println("Oh and here's a little something for you");
                System.out.println("GAME OVER");
            }
        }
    }
}
