package practice;

import java.io.IOException;

class Mobile {
    protected void call() throws Exception {
        System.out.println("Calling");
    }

    public String call(String params) {
        System.out.println("Calling to => " + params);
        return "Called";
    }
}

class Android extends Mobile {
    @Override
    public void call() throws IOException {
        System.out.println("Calling...");
    }

    @Override
    public String call(String params) {
        System.out.println("Android Calling to => " + params);
        return "Called";
    }

}

public class Polymorphism {
    public static void main(String[] args) throws Exception {
        Mobile mobile = new Android();
        mobile.call();
        System.out.println(mobile.call("Venkat"));

    }

}
