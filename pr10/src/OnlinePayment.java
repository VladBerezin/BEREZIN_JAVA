abstract class OnlinePayment extends Payment {
    protected String currency;

    public OnlinePayment(double sum, String type, String currency) {
        super(sum, type);
        this.currency = currency;
    }

    @Override
    public double calculateCommission() {
        return sum * 0.02; // 2% комиссия по умолчанию
    }

    public abstract void processPayment(); // оставляем для наследников
}
