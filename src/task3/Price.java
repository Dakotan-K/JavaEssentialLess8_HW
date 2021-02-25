package task3;

public class Price {
    private String productName;
    private String storeName;
    private String price;

    public Price(String productName, String storeName, String price) {
        this.productName = productName;
        this.storeName = storeName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Название товара: " + this.productName + "\n" + "Название магазина: " + this.storeName + "\n" + "Цена: " + this.price;
    }
}
