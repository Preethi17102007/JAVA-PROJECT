import java.util.Scanner;

class MoodTracker 
{

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
        name = obj.name;
        mood = obj.mood;
        rating = obj.rating;
        date = obj.date;
        day = obj.day;
        note = obj.note;
    }

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

public class Program1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Default Constructor
        MoodTracker obj1 = new MoodTracker();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mood: ");
        String mood = sc.nextLine();

        System.out.print("Enter Rating: ");
        int rating = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Date: ");
        String date = sc.nextLine();

        System.out.print("Enter Day: ");
        String day = sc.nextLine();

        System.out.print("Enter Note: ");
        String note = sc.nextLine();

        // Parameterized Constructor
        MoodTracker obj2 = new MoodTracker(name, mood, rating, date, day, note);

        System.out.println("\nData using Parameterized Constructor");
        obj2.display();

        // Copy Constructor
        MoodTracker obj3 = new MoodTracker(obj2);

        System.out.println("\nData using Copy Constructor");
        obj3.display();

        sc.close();
    }
}
