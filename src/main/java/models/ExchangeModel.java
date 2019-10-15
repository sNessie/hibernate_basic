package models;

import java.math.BigDecimal;

public class ExchangeModel {
    private int id;
    private String name;
    private BigDecimal amount;

    public ExchangeModel(Builder b) {
        this.id = b.id;
        this.name = b.name;
        this.amount = b.amount;
    }

    public static class Builder {
        private int id;
        private String name;
        private BigDecimal amount;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public ExchangeModel build() {
            return new ExchangeModel(this);
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "ExchangeModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }

}

