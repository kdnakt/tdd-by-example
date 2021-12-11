package money;

class Money {
    protected int amount;
    @Override
    public boolean equals(Object o) {
        Money m = (Money) o;
        return amount == m.amount
            && getClass().equals(m.getClass());
    }
}
