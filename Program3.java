class MoodTracker {

    String name;
    String mood;
    int rating;
    String date;
    String day;
    String note;

    // Default Constructor
    MoodTracker() {
        System.out.println("Welcome to Daily Mood Tracker");
    }

    // Parameterized Constructor
    MoodTracker(String name, String mood, int rating, String date, String day, String note) {
        this.name = name;
        this.mood = mood;
        this.rating = rating;
        this.date = date;
        this.day = day;
        this.note = note;
    }

    // Copy Constructor
    MoodTracker(MoodTracker obj) {
        this.name = obj.name;
        this.mood = obj.mood;
        this.rating = obj.rating;
        this.date = obj.date;
        this.day = obj.day;
        this.note = obj.note;
    }

    // Display Method
    void display() {
        System.out.println("\n----- Daily Mood Tracker -----");
        System.out.println("Name   : " + name);
        System.out.println("Mood   : " + mood);
        System.out.println("Rating : " + rating);
        System.out.println("Date   : " + date);
        System.out.println("Day    : " + day);
        System.out.println("Note   : " + note);
    }
}

public class Program3 {

    public static void main(String[] args) {

        // Default Constructor
        MoodTracker obj1 = new MoodTracker();

        // Parameterized Constructor
        MoodTracker obj2 = new MoodTracker(
                "Preethi",
                "Happy",
                5,
                "26-07-2026",
                "Friday",
                "Completed Java Lab"
        );

        System.out.println("\nData using Parameterized Constructor");
        obj2.display();

        // Copy Constructor
        MoodTracker obj3 = new MoodTracker(obj2);

        System.out.println("\nData using Copy Constructor");
        obj3.display();
    }
}