abstract class Payment {
    protected int id;
    protected double sum;
    protected String type;
    protected String status;

    protected static int counter = 0; // подсчёт платежей

    public Payment(double sum, String type) {
        this.sum = sum;
        this.type = type;
        this.status = "Новый";
        counter++;
        this.id = counter;
    }

    public void printInfo() {
        System.out.println("Платёж #" + id + ", сумма: " + sum + ", тип: " + type + ", статус: " + status);
    }

    public static int getPaymentCount() {
        return counter;
    }

    public abstract double calculateCommission(); // абстрактный метод
}

