package money;

abstract class Money {
    protected int amount;
    abstract Money times(int multiplier);
    @Override
    public boolean equals(Object o) {
        Money m = (Money) o;
        return amount == m.amount
            && getClass().equals(m.getClass());
    }
    static Money dollar(int amount) {
        return new Dollar(amount);
    }
    static Money franc(int amount) {
        return new Franc(amount);
    }
}
