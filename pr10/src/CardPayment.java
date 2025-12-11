class CardPayment extends OnlinePayment {
    private String cardNumber;

    public CardPayment(double sum, String currency, String cardNumber) {
        super(sum, "Карта", currency);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        status = "Оплачено картой " + cardNumber;
        System.out.println("Платёж обработан: " + status);
    }
}

class PayPalPayment extends OnlinePayment {
    private String email;

    public PayPalPayment(double sum, String currency, String email) {
        super(sum, "PayPal", currency);
        this.email = email;
    }

    @Override
    public void processPayment() {
        status = "Оплачено через PayPal: " + email;
        System.out.println("Платёж обработан: " + status);
    }
}