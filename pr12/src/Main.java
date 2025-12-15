abstract class Payment {

    public abstract void process(); // абстрактный метод

    public void info() { // обычный метод
        System.out.println("Обработка платежа");
    }
}
class CardPayment extends Payment {
    public void process() {
        System.out.println("Оплата картой");
    }
}
class PayPalPayment extends Payment {
    public void process() {
        System.out.println("Оплата через PayPal");
    }
}
class CashPayment extends Payment {
    public void process() {
        System.out.println("Оплата наличными");
    }
}
class PaymentProcessor {

    public static void processPayments(Payment... payments) {
        for (Payment p : payments) {
            p.info();    // общий метод
            p.process(); // ПОЛИМОРФНЫЙ ВЫЗОВ
            System.out.println();
        }
    }
}
public class Main {
    public static void main(String[] args) {

        Payment p1 = new CardPayment();
        Payment p2 = new PayPalPayment();
        Payment p3 = new CashPayment();

        PaymentProcessor.processPayments(p1, p2, p3);
    }
}