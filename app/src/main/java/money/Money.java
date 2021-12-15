package money;

class Money {
    protected int amount;
    protected String currency;
    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    Money times(int multiplier) {
        return null;
    }
    String currency() {
        return currency;
    }
    @Override
    public boolean equals(Object o) {
        Money m = (Money) o;
        return amount == m.amount
            && currency().equals(m.currency());
    }
    @Override
    public String toString() {
        return amount + " " + currency;
    }
    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }
    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }
}
