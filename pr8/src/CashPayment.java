public class CashPayment extends Payment {
    String worker;

    public CashPayment(int sum, String type, int fee, String worker) {
        super(sum, type, fee);
        this.worker = worker;
    }

    public void info() {
        System.out.println("Cash: " + type + ", sum=" + sum + ", worker=" + worker);
    }
}