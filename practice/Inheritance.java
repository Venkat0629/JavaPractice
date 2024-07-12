package practice;

class Laptop {
    void print() {
        System.out.println("Hello World 1");
    }
}

class Mac extends Laptop {

}

class Windows extends Laptop {

}

public class Inheritance {
    public static void main(String[] args) {
        Laptop mac = new Mac();
        mac.print();
        Laptop windows = new Windows();
        windows.print();
    }
}
