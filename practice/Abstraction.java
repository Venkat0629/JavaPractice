package practice;
abstract class Payment{
   abstract void pay();
}
class UPI extends Payment{

    @Override
    void pay() {
        System.out.println("Payment type is UPI");
    }
}
class Card extends Payment{

    @Override
    void pay() {
        System.out.println("Payment type is Card");
    }
}
class COD extends Payment{

    @Override
    void pay() {
        System.out.println("Payment type is COD");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Payment payment = new Card();
        payment.pay();
        payment = new UPI();
        payment.pay();
        payment = new COD();
        payment.pay();
    }

}
