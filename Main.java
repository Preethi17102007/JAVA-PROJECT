import DailyMood.MoodTracker;

public class Main {

    public static void main(String[] args) {

        MoodTracker m = new MoodTracker();

        // Get mood details
        m.input();

        // Display mood details
        m.display();
    }
}