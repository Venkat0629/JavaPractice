package assignment.w2d3;

class NumberPrinter extends Thread {
    private static Object lock = new Object();
    private static int number = 1;
    private int maxCount;

    public NumberPrinter(int maxCount) {
        this.maxCount = maxCount;
    }

    public void run() {
        while (number <= maxCount) {
            synchronized (lock) {
                if (number % 2 == 0 && Thread.currentThread().getName().equals("EvenThread")) {
                    System.out.println("Even Thread: " + number);
                    number++;
                } else if (number % 2 != 0 && Thread.currentThread().getName().equals("OddThread")) {
                    System.out.println("Odd Thread: " + number);
                    number++;
                }
            }
        }
    }
}

public class PrintEvenOdd {
    public static void main(String[] args) {
        NumberPrinter evenThread = new NumberPrinter(20);
        NumberPrinter oddThread = new NumberPrinter(20);

        evenThread.setName("EvenThread");
        oddThread.setName("OddThread");

        evenThread.start();
        oddThread.start();
    }
}
