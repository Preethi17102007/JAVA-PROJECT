class MoodTracker {

    // Private Variables (Access Modifiers)
    private String name = "Preethi";
    private String mood = "Happy";
    private int rating = 5;
    private String date = "26-07-2026";
    private String day = "Friday";
    private String note = "Feeling Good";

    // Static Variable
    static String appName = "Daily Mood Tracker";

    // Static Method
    static void appInfo() {
        System.out.println("Application Name : " + appName);
    }

    // Method Overloading - Method 1 (2 Parameters)
    public void display(String name, String mood) {
        System.out.println("\nName : " + name);
        System.out.println("Mood : " + mood);
    }

    // Method Overloading - Method 2 (3 Parameters)
    public void display(String name, String mood, int rating) {
        System.out.println("\nName   : " + name);
        System.out.println("Mood   : " + mood);
        System.out.println("Rating : " + rating);
    }

    // Method Overloading - Method 3 (Full Details)
    public void display(String name, String mood, int rating, String date, String day, String note) {
        System.out.println("\n----- Daily Mood Tracker -----");
        System.out.println("Name   : " + name);
        System.out.println("Mood   : " + mood);
        System.out.println("Rating : " + rating);
        System.out.println("Date   : " + date);
        System.out.println("Day    : " + day);
        System.out.println("Note   : " + note);
    }
}

public class Program2 {

    public static void main(String[] args) {

        // Calling Static Method
        MoodTracker.appInfo();

        // Creating Object
        MoodTracker obj = new MoodTracker();

        // Calling Overloaded Methods
        obj.display("Preethi", "Happy");

        obj.display("Preethi", "Happy", 5);

        obj.display("Preethi", "Happy", 5,
                    "26-07-2026", "Sunday", "Feeling Good");
    }
}