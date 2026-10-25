class MoodData {
    synchronized void updateMood(DateData date) {
        System.out.println("Thread 1: Locked MoodData");
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        date.displayDate();
    }

    synchronized void displayMood() {
        System.out.println("Thread 2: Locked MoodData");
    }
}

class DateData {
    synchronized void updateDate(MoodData mood) {
        System.out.println("Thread 2: Locked DateData");
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        mood.displayMood();
    }

    synchronized void displayDate() {
        System.out.println("Thread 1: Waiting for DateData");
    }
}

public class Program10 {

    public static void main(String[] args) {

        MoodData mood = new MoodData();
        DateData date = new DateData();

        Thread t1 = new Thread(() -> {
            mood.updateMood(date);
        });

        Thread t2 = new Thread(() -> {
            date.updateDate(mood);
        });

        t1.start();
        t2.start();
    }
}