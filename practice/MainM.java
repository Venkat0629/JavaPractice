package practice;

class VolatileExample extends Thread {
    private boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Running");
        }
    }

    public void stopRunning() {
        running = false;
    }
}

public class MainM {
    public static void main(String[] args) throws InterruptedException {
        VolatileExample example = new VolatileExample();
        example.start();

        // Sleep for 1 second
        Thread.sleep(1000);

        example.stopRunning();
    }
}

 
