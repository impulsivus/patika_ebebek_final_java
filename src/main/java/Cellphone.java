public class Cellphone extends Product {
    private final int storage;
    private final int battery;
    private final int ram;
    private final String color;

    public Cellphone(int productId, double unitPrice, double discount, String productName, Brand brand, int storage, int battery, int ram, String color) {
        super(productId, unitPrice, discount, productName, brand);
        this.storage = storage;
        this.battery = battery;
        this.ram = ram;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public int getBattery() {
        return battery;
    }

    public String getColor() {
        return color;
    }
}
