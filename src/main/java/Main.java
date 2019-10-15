import services.ManageExchanges;

public class Main {
    public static void main(String[] args) {
        ManageExchanges manager = new ManageExchanges();
        manager.getExchanges().forEach(System.out::println);
    }
}
