package practice;

import java.io.IOException;

class Mobile {
    public void call() throws Exception {
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

