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

    // Method Overriding with super keyword
    
    void showUser() {
        System.out.println("Details using method overriding");
        super.showUser();   // Calls parent class method
        
    }

    void showMood() {
        System.out.println("Mood   : " + mood);
        System.out.println("Rating : " + rating);
    }
}

public class Program5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- Method Overriding using Super Keyword -----");

        Mood obj = new Mood();

        obj.getUser(sc);
        obj.getMood(sc);

        System.out.println("\n----- Daily Mood Tracker -----");
        obj.showUser();
        obj.showMood();

        sc.close();
    }
}