import java.util.Scanner;

// User-defined exception
class InvalidRatingException extends Exception {
    InvalidRatingException(String message) {
        super(message);
    }
}

public class Program7 {

    static void checkRating(int rating) throws InvalidRatingException {
        if (rating < 1 || rating > 5) {
            throw new InvalidRatingException("Rating must be between 1 and 5.");
        }
        System.out.println("Rating is valid.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your mood: ");
        String mood = sc.nextLine();

        System.out.print("Enter mood rating (1-5): ");
        int rating = sc.nextInt();

        try {
            checkRating(rating);

            System.out.println("\n--- Daily Mood Tracker ---");
            System.out.println("Name   : " + name);
            System.out.println("Mood   : " + mood);
            System.out.println("Rating : " + rating);
        }
        catch (InvalidRatingException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}