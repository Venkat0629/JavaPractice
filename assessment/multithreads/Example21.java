package assessment.multithreads;

import java.util.concurrent.*;

public class Example21 {

    private static class NumberPrinter implements Runnable {
        private static int number = 1;
        private static final Object lock = new Object();
        private BlockingQueue<Integer> queue;

        public NumberPrinter(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (number <= 20) {
                synchronized (lock) {
                    if (number <= 20) {
                        try {
                            queue.put(number);
                            number++;
                        } catch (InterruptedException e) {
                            System.out.println(e.getMessage());
                        }
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
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(new NumberPrinter(queue));
        executor.submit(new NumberPrinter(queue));

        executor.shutdown();

        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        while (!queue.isEmpty()) {
            try {
                System.out.println("Number from queue: " + queue.take());
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

