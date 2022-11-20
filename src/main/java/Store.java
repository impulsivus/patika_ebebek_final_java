import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Store {

    private int mainLevel = 0;
    private int subLevel = 0;
    private Scanner s = new Scanner(System.in);

    private final ArrayList<Notebook> notebooks = new ArrayList<>();
    private final ArrayList<Cellphone> cellphones = new ArrayList<>();

    private final ArrayList<Brand> brandStore = new utils().populateAndReturnBrands();

    public void printMainMenu() {
        System.out.println("Welcome to PatikaStore!\n");
        System.out.println("Please pick an action:");
        System.out.println("1 - Notebook menu");
        System.out.println("2 - Cellphone menu");
        System.out.println("3 - View registered brands");
        System.out.println("4 - Exit");
    }

    public void printNotebookMenu() {
        System.out.println("Welcome to PatikaStore!\n");
        System.out.println("Notebook menu\n");
        System.out.println("1 - Add notebook");
        System.out.println("2 - List all notebooks");
        System.out.println("3 - List notebooks by brand");
        System.out.println("4 - Get notebook by ID");
        System.out.println("5 - Delete notebook");
        System.out.println("6 - Back");
        System.out.println("7 - Exit");
    }

    public void printCellphoneMenu() {
        System.out.println("Welcome to PatikaStore!\n");
        System.out.println("Cellphone menu\n");
        System.out.println("1 - Add cellphone");
        System.out.println("2 - List all cellphones");
        System.out.println("3 - List cellphones by brand");
        System.out.println("4 - Get cellphone by ID");
        System.out.println("5 - Delete cellphone");
        System.out.println("6 - Back");
        System.out.println("7 - Exit");
    }

    public void addNotebookMenu() {
        System.out.println("Add Notebook");
        System.out.println("Unit Price:");
        double unitPrice = s.nextDouble();
        System.out.println("Discount (%):");
        double discount = s.nextDouble();
        System.out.println("Product Name:");
        String productName = s.next();
        System.out.println("Brand ID:");
        int brandID = s.nextInt();
        System.out.println("Storage (GB):");
        int storage = s.nextInt();
        System.out.println("RAM (GB):");
        int ram = s.nextInt();
        System.out.println("Screen size (Inches):");
        int screenSize = s.nextInt();

        notebooks.add(new Notebook(notebooks.size(),unitPrice,discount,productName,brandStore.get(brandID),storage,ram,screenSize));
        System.out.println("Notebook added.\n Press 0 to go back.");
        if(s.nextInt() == 0) {
            subLevel = 0;
        } else {
            System.out.println("Invalid input.");
        }
    }

    public void listNotebooksMenu() {
        System.out.println("List Notebooks");
        System.out.println("ID\tName\tUnit Price\tDiscount (%)\tBrand ID\tBrand Name\tStorage (GB)\tRAM (GB)\tScreen Size (Inches)");
        for(Notebook n : notebooks) {
            System.out.println(n.getProductId() + "\t"+n.getProductName()+"\t"+n.getDiscount()+"\t"
                    +n.getBrand().getBrandId()+"\t"+n.getBrand().getBrandName()+"\t"+n.getStorage()+"\t"+n.getRam()+"\t"
                    +n.getScreenSize());
        }
        System.out.println("\n Press 0 to go back.");
        if(s.nextInt() == 0) {
            subLevel = 0;
        } else {
            System.out.println("Invalid input.");
        }
    }
    public void listNotebooksByBrandMenu(int brandId) {
        System.out.println("List Notebooks By Brand");
        System.out.println("ID\tName\tUnit Price\tDiscount (%)\tBrand ID\tBrand Name\tStorage (GB)\tRAM (GB)\tScreen Size (Inches)");
        for(Notebook n : notebooks) {
            if(n.getBrand().getBrandId() == brandId)
                System.out.println(n.getProductId() + "\t"+n.getProductName()+"\t"+n.getDiscount()+"\t"
                        +n.getBrand().getBrandId()+"\t"+n.getBrand().getBrandName()+"\t"+n.getStorage()+"\t"+n.getRam()+"\t"
                        +n.getScreenSize());
        }
        System.out.println("\n Press 0 to go back.");
        if(s.nextInt() == 0) {
            subLevel = 0;
        } else {
            System.out.println("Invalid input.");
        }
    }
    public void listNotebookByIDMenu(int notebookId) {
        System.out.println("List Notebooks By Brand");
        System.out.println("ID\tName\tUnit Price\tDiscount (%)\tBrand ID\tBrand Name\tStorage (GB)\tRAM (GB)\tScreen Size (Inches)");
        for(Notebook n : notebooks) {
            if(n.getProductId() == notebookId)
                System.out.println(n.getProductId() + "\t"+n.getProductName()+"\t"+n.getDiscount()+"\t"
                        +n.getBrand().getBrandId()+"\t"+n.getBrand().getBrandName()+"\t"+n.getStorage()+"\t"+n.getRam()+"\t"
                        +n.getScreenSize());
        }
        System.out.println("\nPress 0 to go back.");
        if(s.nextInt() == 0) {
            subLevel = 0;
        } else {
            System.out.println("Invalid input.");
        }
    }
    public void deleteNotebook(int notebookId) {
        System.out.println("Delete Notebook");
        try {
            notebooks.remove(notebookId);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Couldn't delete.");
        } finally {
            System.out.println("Item deleted.");
        }
        System.out.println("\nPress 0 to go back.");
        if(s.nextInt() == 0) {
            subLevel = 0;
        } else {
            System.out.println("Invalid input.");
        }
    }
    public void addCellphoneMenu() {
        System.out.println("Add Cellphone");
        System.out.println("Unit Price:");
        double unitPrice = s.nextDouble();
        System.out.println("Discount (%):");
        double discount = s.nextDouble();
        System.out.println("Product Name:");
        String productName = s.next();
        System.out.println("Brand ID:");
        int brandID = s.nextInt();
        System.out.println("Storage (GB):");
        int storage = s.nextInt();
        System.out.println("RAM (GB):");
        int ram = s.nextInt();
        System.out.println("Battery Size (mAh):");
        int battery = s.nextInt();
        System.out.println("Color:");
        String color = s.next();

        cellphones.add(new Cellphone(cellphones.size(),unitPrice,discount,productName,brandStore.get(brandID),storage,ram,battery,color));
        System.out.println("Notebook added.\n Press 0 to go back.");
        if(s.nextInt() == 0) {
            subLevel = 0;
        } else {
            System.out.println("Invalid input.");
        }
    }

    public void listCellphonesMenu() {
        System.out.println("List Cellphones");
        System.out.println("ID\tName\tUnit Price\tDiscount (%)\tBrand ID\tBrand Name\tStorage (GB)\tRAM (GB)\tBattery Capacity (mAh)\tColor");
        for(Cellphone c : cellphones) {
            System.out.println(c.getProductId() + "\t"+c.getProductName()+"\t"+c.getDiscount()+"\t"
                    +c.getBrand().getBrandId()+"\t"+c.getBrand().getBrandName()+"\t"+c.getStorage()+"\t"+c.getRam()+"\t"
                    +c.getBattery()+"\t"+c.getColor());
        }
        System.out.println("\n Press 0 to go back.");
        if(s.nextInt() == 0) {
            subLevel = 0;
        } else {
            System.out.println("Invalid input.");
        }
    }
    public void listCellphonesByBrand(int brandId) {
        System.out.println("List Cellphones By Brand");
        System.out.println("ID\tName\tUnit Price\tDiscount (%)\tBrand ID\tBrand Name\tStorage (GB)\tRAM (GB)\tBattery Capacity (mAh)\tColor");
        for(Cellphone c : cellphones) {
            if(c.getBrand().getBrandId() == brandId)
                System.out.println(c.getProductId() + "\t"+c.getProductName()+"\t"+c.getDiscount()+"\t"
                        +c.getBrand().getBrandId()+"\t"+c.getBrand().getBrandName()+"\t"+c.getStorage()+"\t"+c.getRam()+"\t"
                        +c.getBattery()+"\t"+c.getColor());
        }
        System.out.println("\n Press 0 to go back.");
        if(s.nextInt() == 0) {
            subLevel = 0;
        } else {
            System.out.println("Invalid input.");
        }
    }
    public void listCellphoneById(int cellphoneId) {
        System.out.println("List Notebooks By Brand");
        System.out.println("ID\tName\tUnit Price\tDiscount (%)\tBrand ID\tBrand Name\tStorage (GB)\tRAM (GB)\tBattery Capacity (mAh)\tColor");
        for(Cellphone c : cellphones) {
            if(c.getProductId() == cellphoneId)
                System.out.println(c.getProductId() + "\t"+c.getProductName()+"\t"+c.getDiscount()+"\t"
                        +c.getBrand().getBrandId()+"\t"+c.getBrand().getBrandName()+"\t"+c.getStorage()+"\t"+c.getRam()+"\t"
                        +c.getBattery()+"\t"+c.getColor());
        }
        System.out.println("\nPress 0 to go back.");
        if(s.nextInt() == 0) {
            subLevel = 0;
        } else {
            System.out.println("Invalid input.");
        }
    }
    public void deleteCellphone(int cellphoneId) {
        System.out.println("Delete Notebook");
        try {
            cellphones.remove(cellphoneId);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Couldn't delete.");
        } finally {
            System.out.println("Item deleted.");
        }
        System.out.println("\nPress 0 to go back.");
        if(s.nextInt() == 0) {
            subLevel = 0;
        } else {
            System.out.println("Invalid input.");
        }
    }

    public void run() {
        while (true) {
            if (mainLevel == 0) {
                subLevel = 0;
                printMainMenu();
                mainLevel = s.nextInt();
            } else if (mainLevel == 1) {
                if (subLevel == 0) {
                    printNotebookMenu();
                    switch (s.nextInt()) {
                        case 1:
                            subLevel = 1;
                            break;
                        case 2:
                            subLevel = 2;
                            break;
                        case 3:
                            subLevel = 3;
                            break;
                        case 4:
                            subLevel = 4;
                            break;
                        case 5:
                            subLevel = 5;
                            break;
                        case 6:
                            subLevel = 6;
                            break;
                        case 7:
                            subLevel = 7;
                            break;
                        default:
                            System.out.println("Invalid input.");
                            break;
                    }
                }
                if(subLevel == 1) {
                    addNotebookMenu();
                }
                if(subLevel == 2) {
                    listNotebooksMenu();
                }
                if(subLevel == 3) {
                    System.out.println("Brand ID:");
                    listNotebooksByBrandMenu(s.nextInt());
                }
                if(subLevel == 4) {
                    System.out.println("Notebook ID:");
                    listNotebookByIDMenu(s.nextInt());
                }
                if(subLevel == 5) {
                    System.out.println("Notebook ID:");
                    deleteNotebook(s.nextInt());
                }
                if(subLevel == 6) {
                    subLevel = 0;
                    mainLevel = 0;
                }
                if(subLevel == 7) {
                    exit(0);
                }
            } else if (mainLevel == 2) {
                if (subLevel == 0) {
                    printCellphoneMenu();
                    switch (s.nextInt()) {
                        case 1:
                            subLevel = 1;
                            break;
                        case 2:
                            subLevel = 2;
                            break;
                        case 3:
                            subLevel = 3;
                            break;
                        case 4:
                            subLevel = 4;
                            break;
                        case 5:
                            subLevel = 5;
                            break;
                        case 6:
                            subLevel = 6;
                            break;
                        case 7:
                            subLevel = 7;
                            break;
                        default:
                            System.out.println("Invalid input.");
                            break;
                    }
                }
                if(subLevel == 1) {
                    addCellphoneMenu();
                }
                if(subLevel == 2) {
                    listCellphonesMenu();
                }
                if(subLevel == 3) {
                    System.out.println("Brand ID:");
                    listCellphonesByBrand(s.nextInt());
                }
                if(subLevel == 4) {
                    System.out.println("Cellphone ID:");
                    listCellphoneById(s.nextInt());
                }
                if(subLevel == 5) {
                    System.out.println("Cellphone ID:");
                    deleteCellphone(s.nextInt());
                }
                if(subLevel == 6) {
                    subLevel = 0;
                    mainLevel = 0;
                }
                if(subLevel == 7) {
                    exit(0);
                }
            } else if (mainLevel == 3) {
                new utils().printBrandList();
                System.out.println("\nPress 0 to go back.");
                if(s.nextInt() == 0) {
                    subLevel = 0;
                    mainLevel = 0;
                } else {
                    System.out.println("Invalid input.");
                }
            } else {
                exit(0);
            }
        }
    }
}
