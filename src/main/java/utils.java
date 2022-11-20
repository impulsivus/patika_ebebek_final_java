import java.util.ArrayList;

public class utils {
    private final ArrayList<Brand> brandList = new ArrayList<>();
    public void populateBrands() {

        brandList.add(new Brand("Samsung",0));
        brandList.add(new Brand("Lenovo",1));
        brandList.add(new Brand("Apple",2));
        brandList.add(new Brand("Huawei",3));
        brandList.add(new Brand("Casper",4));
        brandList.add(new Brand("Asus",5));
        brandList.add(new Brand("HP",6));
        brandList.add(new Brand("Xiaomi",7));
        brandList.add(new Brand("Monster",8));
    }

    public ArrayList<Brand> populateAndReturnBrands() {
        populateBrands();
        return this.brandList;
    }

    public void printBrandList() {
        populateBrands();
        System.out.println("Brands:");
        System.out.println("ID\t\t\tName");
        for(Brand b : brandList) {
            System.out.println(b.getBrandId()+"\t\t\t"+b.getBrandName());
        }
    }
}
