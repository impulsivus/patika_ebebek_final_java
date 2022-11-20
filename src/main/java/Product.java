public class Product {
    private final int productId;
    private final double unitPrice;
    private final double discount;
    private final String productName;
    private final Brand brand;

    public Product(int productId, double unitPrice, double discount, String productName, Brand brand)
    {
        this.productId = productId;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.productName = productName;
        this.brand = brand;
    }

    public int getProductId() {
        return productId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public String getProductName() {
        return productName;
    }

    public Brand getBrand() {
        return brand;
    }
}
