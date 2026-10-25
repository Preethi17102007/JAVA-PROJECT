class MoodTracker {

    synchronized void displayMood() {
        try {
            wait();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Mood: Happy");
        System.out.println("Mood:Sad");
    }

    synchronized void updateMood() {
        System.out.println("Updating Mood...");
        notify();
    }
}

class MyThread extends Thread {

    MoodTracker m;

    MyThread(MoodTracker m) {
        this.m = m;
    }

    public void run() {
        m.displayMood();
    }
}

public class Program9 {

    public static void main(String[] args) {

        MoodTracker m = new MoodTracker();

        MyThread t1 = new MyThread(m);

        t1.start();

        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e);
        }

        m.updateMood();
    }
}