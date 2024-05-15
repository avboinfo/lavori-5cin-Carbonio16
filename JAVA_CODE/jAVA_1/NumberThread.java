public class NumberThread extends Thread {
    private static int nextNumber = 1;
    private int var;

    public NumberThread() {
        synchronized (NumberThread.class) {
            var = nextNumber++;
        }
    }

    public void run() {
        System.out.println("Thread numero " + var + " eseguito.");
        if (var < 10) {
            NumberThread nextThread = new NumberThread();
            nextThread.start();
            try {
                nextThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        NumberThread initialThread = new NumberThread();
        initialThread.start();
        try {
            initialThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}