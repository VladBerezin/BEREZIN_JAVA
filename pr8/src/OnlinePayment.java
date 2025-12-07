public class OnlinePayment extends Payment {
    String mail;

    public OnlinePayment(int sum, String type, int fee, String mail) {
        super(sum, type, fee);
        this.mail = mail;
    }

    public void info() {
        System.out.println("Online: " + type + ", sum=" + sum + ", mail=" + mail);
    }
}