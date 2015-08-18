package Fantasy;

public class Choice {
    public final String name;

    private String extra;
    private Story story;
    private String gameOver;

    public Choice(String name, Story story) {
        this.name = name;
        this.story = story;
    }

    public Choice(String name, String story) {
        this.name = name;
        this.gameOver = story;
    }

    public Choice(String name, Story story, String extra) {
        // Edge cases, you know? :/
        this.name = name;
        this.story = story;
        this.extra = extra;
    }

    public void play() {
        if (extra != null)
            System.out.println(extra);
        if (story != null)
            story.play();
        else {
            System.out.println(gameOver);
            System.out.println("GAME OVER");
        }
    }
}
