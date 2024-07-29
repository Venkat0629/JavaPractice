package assessment.multithreads;

public class Example18 {

    private static class NumberPrinter implements Runnable {
        private static int number = 1;
        private static final Object lock = new Object();

        @Override
        public void run() {
            while (number <= 20) {
                synchronized (lock) {
                    if (number <= 20) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread evenThread = new Thread(new NumberPrinter(), "Even Thread");
        Thread oddThread = new Thread(new NumberPrinter(), "Odd Thread");

        evenThread.start();
        oddThread.start();
    }

}
