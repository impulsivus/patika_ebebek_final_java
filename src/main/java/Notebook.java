public class Notebook extends Product {
    private final int storage;
    private final int ram;
    private final int screenSize;

    public Notebook(int productId, double unitPrice, double discount, String productName, Brand brand, int storage, int ram, int screenSize) {
        super(productId, unitPrice, discount, productName, brand);
        this.storage = storage;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public int getStorage() {
        return storage;
    }
}
