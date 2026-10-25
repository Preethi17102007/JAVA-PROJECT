package DailyMood;

import java.util.*;

public class MoodTracker {

    String name, mood, date, day, note;
    int rating;

    public void input() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        name = sc.nextLine();

        System.out.println("Enter Mood:");
        mood = sc.nextLine();

        System.out.println("Enter Rating (1-5):");
        rating = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Date:");
        date = sc.nextLine();

        System.out.println("Enter Day:");
        day = sc.nextLine();

        System.out.println("Enter Note:");
        note = sc.nextLine();
    }

    public void display() {

        System.out.println("===================================");
        System.out.println("       DAILY MOOD TRACKER");
        System.out.println("===================================");
        System.out.println("Name   : " + name);
        System.out.println("Mood   : " + mood);
        System.out.println("Rating : " + rating);
        System.out.println("Date   : " + date);
        System.out.println("Day    : " + day);
        System.out.println("Note   : " + note);
    }
}