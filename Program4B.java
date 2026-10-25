import java.util.Scanner;

class User {
    String name;

    void getUser(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }

    void showUser() {
        System.out.println("Name   : " + name);
    }
}

class Mood extends User {
    String mood;
    int rating;

    void getMood(Scanner sc) {
        System.out.print("Enter Mood: ");
        mood = sc.nextLine();

        System.out.print("Enter Rating: ");
        rating = sc.nextInt();
        sc.nextLine();
    }

    void showMood() {
        System.out.println("Mood   : " + mood);
        System.out.println("Rating : " + rating);
    }
}

class MoodHistory extends Mood {
    String date;
    String day;
    String note;

    void getHistory(Scanner sc) {
        System.out.print("Enter Date: ");
        date = sc.nextLine();

        System.out.print("Enter Day: ");
        day = sc.nextLine();

        System.out.print("Enter Note: ");
        note = sc.nextLine();
    }

    void showHistory() {
        System.out.println("Date   : " + date);
        System.out.println("Day    : " + day);
        System.out.println("Note   : " + note);
    }
}

public class Program4B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("-----MULTI-LEVEL INHERITANCE-----");

        MoodHistory obj = new MoodHistory();

        obj.getUser(sc);
        obj.getMood(sc);
        obj.getHistory(sc);

        System.out.println("\n----- Daily Mood Tracker -----");
        obj.showUser();
        obj.showMood();
        obj.showHistory();

        sc.close();
    }
}