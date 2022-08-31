package com.example.tddpractice;

class Money implements Expression {
    protected String currency;
    protected int amount;

    @Override
    public Money reduce(String to) {
        return null;
    }

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
    }

    String currency() {
        return this.currency;
    }

    public String toString() {
        return amount + " " + currency;
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    Expression plus(Money addend) {
        return new Sum(this, addend);
    }

}
