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
    }

    void showMood() {
        System.out.println("Mood   : " + mood);
        System.out.println("Rating : " + rating);
    }
}

public class Program4A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("-----SINGLE INHERITANCE-----");

        Mood obj = new Mood();

        obj.getUser(sc);
        obj.getMood(sc);

        System.out.println("\n----- Daily Mood Tracker -----");
        obj.showUser();
        obj.showMood();

        sc.close();
    }
}