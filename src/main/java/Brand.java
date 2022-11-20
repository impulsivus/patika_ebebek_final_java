public class Brand {
    private final String brandName;
    private final int brandId;

    public Brand(String brandName, int brandId) {
        this.brandName = brandName;
        this.brandId = brandId;
    }

    public String getBrandName() {
        return this.brandName;
    }
    public int getBrandId() {
        return this.brandId;
    }
}
