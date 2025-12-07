public class Main {
    public static void main(String[] args) {

        Payment p1 = new Payment(100, "base", 5);
        OnlinePayment p2 = new OnlinePayment(50, "online", 2, "test@mail.com");
        CashPayment p3 = new CashPayment(70, "cash", 0, "Ivan");

        p1.info();
        p2.info();
        p3.info();

        System.out.println("Total p1 = " + p1.total());
        System.out.println("Total p2 = " + p2.total());
        System.out.println("Total p3 = " + p3.total());
    }
}