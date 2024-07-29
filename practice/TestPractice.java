package practice;

import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPractice {
    private static int val = 0;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.submit(TestPractice::increment);
        }
        Optional<String> optional = Optional.ofNullable(null);
        System.out.println(optional.orElse("NullPointerException"));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(val);
//        for (int i = 0; i < 5; i++) {
//            increment();
//        }

        executorService.shutdown();
    }

    private static void increment() {
        for (int i = 0; i < 100; i++) {
            val++;
        }
//        System.out.println("Incremented value: " + val + " Thread: " + Thread.currentThread().getName());
    }

}
