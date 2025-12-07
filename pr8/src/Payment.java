public class Payment {
    int sum;
    String type;
    int fee;

    public Payment(int sum, String type, int fee) {
        this.sum = sum;
        this.type = type;
        this.fee = fee;
    }

    public int total() {
        return sum + fee;
    }

    public void info() {
        System.out.println("Payment: " + type + ", sum=" + sum + ", fee=" + fee);
    }
}
