package practice;
class Laptop{
    void print(){
        System.out.println("Hello World");
    }
}
class Mac extends Laptop{

}
class Windows extends Laptop{

}
public class Inheritance {
    public static void main(String[] args) {
        Laptop laptop = new Mac();
        laptop.print();
    }
}
