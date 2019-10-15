import models.ExchangeModel;
import services.ManageExchanges;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ManageExchanges manager = new ManageExchanges();
        manager.addExchange(new ExchangeModel(3,"Adas", new BigDecimal("7000")));
        manager.getExchanges().forEach(System.out::println);
    }
}
