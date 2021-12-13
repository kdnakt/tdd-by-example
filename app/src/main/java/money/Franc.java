package money;

class Franc extends Money {
    private String currency;
    Franc(int amount) {
        this.amount = amount;
        this.currency = "CHF";
    }
    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
    String currency() {
        return currency;
    }
}
