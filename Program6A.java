import java.util.Scanner;

// Abstract Class
abstract class MoodTracker {

    String name;
    String mood;
    int rating;
    String date;
    String day;
    String note;

    // Non Abstract Method
    void getDetails(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Mood: ");
        mood = sc.nextLine();

        System.out.print("Enter Rating: ");
        rating = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Date: ");
        date = sc.nextLine();

        System.out.print("Enter Day: ");
        day = sc.nextLine();

        System.out.print("Enter Note: ");
        note = sc.nextLine();
    }

    // Abstract Method
    abstract void display();
}

// Subclass
class DailyMood extends MoodTracker {

    
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

public class Program6A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("-----Abstract Class-----");

        // Abstract class reference, subclass object
        MoodTracker obj = new DailyMood();

        obj.getDetails(sc);
        obj.display();

        sc.close();
    }
}