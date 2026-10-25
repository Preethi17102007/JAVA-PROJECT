class MoodTracker extends Thread {

    public void run() {
        System.out.println("-----Daily Mood Tracker-----");
        System.out.println("Name:Preethi");
        System.out.println("Mood: Happy");
        System.out.println("Rating: 5");
        System.out.println("Date:23/09/2026");
        System.out.println("Day:Wednesday");
        System.out.println("Note: Feeling Good");
    }
}

public class Program8a {
    public static void main(String[] args) {
       
        MoodTracker t = new MoodTracker();
        t.start();
      
        
    }
}

