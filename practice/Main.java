package practice;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //HashMap
        HashMap();
        //LinkedHashMap
        LinkedHashMap();
        //TreeMap
        TreeMap();
        //ConcurrentHashMap
        ConcurrentHashMap();

    }

    private static void TreeMap() {
        Map<Employee, Double> data = Employee.loadData("TreeMap");
        System.out.println(data);
        Double salary = data.get(new Employee(103, "Harsha", 25));
        System.out.println("Harsha=> " + salary);
    }

    private static void HashMap() {
        Map<Employee, Double> data = Employee.loadData("HashMap");
        System.out.println(data);
        Double salary = data.get(new Employee(105, "Venkat", 24));
        System.out.println("Venkat=> " + salary);
    }

    private static void LinkedHashMap() {
        Map<Employee, Double> data = Employee.loadData("LinkedHashMap");
        System.out.println(data);
        Double salary = data.get(new Employee(104, "Naveen", 27));
        System.out.println("Naveen=> " + salary);
    }

    private static void ConcurrentHashMap() throws InterruptedException {
        Map<String, AtomicLong> data = new ConcurrentHashMap<>();
        data.put("Chicken Biryani", new AtomicLong());
        data.put("Mutton Biryani", new AtomicLong());
        data.put("Veg Biryani", new AtomicLong());

        ExecutorService service = Executors.newFixedThreadPool(3);

        service.submit(() -> processOrders(data));
        service.submit(() -> processOrders(data));
        service.submit(() -> processOrders(data));

        service.awaitTermination(3, TimeUnit.SECONDS);
        service.shutdown();
        System.out.println("*************************************************************");
        System.out.println(data);


    }

    private static void processOrders(Map<String, AtomicLong> data) {
        for (String order : data.keySet()) {
            for (int i = 0; i < 50; i++) {
                AtomicLong l = data.get(order);
                l.incrementAndGet();
                data.put(order, l);

            }
        }
    }


}