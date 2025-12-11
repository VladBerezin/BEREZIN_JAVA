public class Main {
    public static void main(String[] args) {

        CardPayment p1 = new CardPayment(1000, "RUB", "1234-5678-9012-3456");
        PayPalPayment p2 = new PayPalPayment(500, "USD", "example@mail.com");

        p1.printInfo();
        p2.printInfo();

        System.out.println("Комиссия p1: " + p1.calculateCommission());
        System.out.println("Комиссия p2: " + p2.calculateCommission());

        p1.processPayment();
        p2.processPayment();

        System.out.println("Всего платежей: " + Payment.getPaymentCount());
    }
}