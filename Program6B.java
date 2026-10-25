import java.util.Scanner;

// Interface 1
interface UserInfo {
    void getUser(Scanner sc);
}

// Interface 2
interface MoodInfo {
    void getMood(Scanner sc);
}

// Class implementing both interfaces
class DailyMood implements UserInfo, MoodInfo {

    String name;
    String mood;
    int rating;
    String date;
    String day;
    String note;

    // Method from UserInfo interface
    public void getUser(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }

    // Method from MoodInfo interface
    public void getMood(Scanner sc) {
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

public class Program6B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("---Multiple Inheritance with Interface---");

        // Creating object
        DailyMood obj = new DailyMood();

        // Call by Reference (Interface References)
        UserInfo user = obj;
        MoodInfo mood = obj;

        // Calling methods using interface references
        user.getUser(sc);
        mood.getMood(sc);

        // Calling class method
        obj.display();

        sc.close();
    }
}