package models;

import java.math.BigDecimal;

// do poprawego działania Hibernate potrzebuje bezargumentowego konstuktora i gettery i settery

public class ExchangeModel {
    private int id;
    private String name;
    private BigDecimal amount;

    public ExchangeModel() { }

    public ExchangeModel(int id, String name, BigDecimal amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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

