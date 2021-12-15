package money;

abstract class Money {
    protected int amount;
    protected String currency;
    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    abstract Money times(int multiplier);
    String currency() {
        return currency;
    }
    @Override
    public boolean equals(Object o) {
        Money m = (Money) o;
        return amount == m.amount
            && getClass().equals(m.getClass());
    }
    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }
    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }
}
