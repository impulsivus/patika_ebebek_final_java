import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Store {

    private int mainLevel = -1;
    private int subLevel = -1;
    private Scanner s = new Scanner(System.in);

    private final ArrayList<Notebook> notebooks = new ArrayList<>();
    private final ArrayList<Cellphone> cellphones = new ArrayList<>();

    private final utils u = new utils();
    private final ArrayList<Brand> brandStore = u.populateAndReturnBrands();

    private static final String[] mainMenuItems =
            {
                    "Notebook Menu",
                    "Cellphone Menu",
                    "View Registered Brands",
                    "Exit"
            };
    private static final String[] notebookMenuItems =
            {
                    "Add Notebook",
                    "List All Notebooks",
                    "Filter Notebooks by Brand",
                    "Get Notebook by ID",
                    "Delete Notebook",
                    "Back",
                    "Exit"
            };
    private static final String[] cellphoneMenuItems =
            {
                    "Add Cellphone",
                    "List All Cellphones",
                    "Filter Cellphones by Brand",
                    "Get Cellphone by ID",
                    "Delete Cellphone",
                    "Back",
                    "Exit"
            };

    public void printMainMenu() {
        System.out.println("Welcome to PatikaStore!\n");
        System.out.println("Please pick an action:");
        for(int i = 0; i < mainMenuItems.length; i++)
            System.out.println(i+" - "+mainMenuItems[i]);
    }

    public void printNotebookMenu() {
        System.out.println("Welcome to PatikaStore!\n");
        System.out.println("Notebook menu\n");
        for(int i = 0; i < notebookMenuItems.length; i++)
            System.out.println(i+" - "+notebookMenuItems[i]);
    }

    public void printCellphoneMenu() {
        System.out.println("Welcome to PatikaStore!\n");
        System.out.println("Cellphone menu\n");
        for(int i = 0; i < cellphoneMenuItems.length; i++)
            System.out.println(i+" - "+cellphoneMenuItems[i]);
    }

    public void addNotebookMenu() {
        System.out.println("Add Notebook");
        System.out.println("Unit Price:");
        double unitPrice = s.nextDouble();
        System.out.println("Discount (%):");
        double discount = s.nextDouble();
        System.out.println("Product Name:");
        String productName = s.next();
        u.printBrandList();
        System.out.println("Brand ID:");
        int brandID = s.nextInt();
        System.out.println("Storage (GB):");
        int storage = s.nextInt();
        System.out.println("RAM (GB):");
        int ram = s.nextInt();
        System.out.println("Screen size (Inches):");
        int screenSize = s.nextInt();

        notebooks.add(new Notebook(notebooks.size(),unitPrice,discount,productName,brandStore.get(brandID),storage,ram,screenSize));
        System.out.println("Notebook added.\n Press 9 to go back.");
        if(s.nextInt() == 9) {
            subLevel = -1;
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
        System.out.println("\n Press 9 to go back.");
        if(s.nextInt() == 9) {
            subLevel = -1;
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
        System.out.println("\n Press 9 to go back.");
        if(s.nextInt() == 9) {
            subLevel = -1;
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
        System.out.println("\nPress 9 to go back.");
        if(s.nextInt() == 9) {
            subLevel = -1;
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
        System.out.println("\nPress 9 to go back.");
        if(s.nextInt() == 9) {
            subLevel = -1;
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
        u.printBrandList();
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
        System.out.println("Cellphone added.\n Press 9 to go back.");
        if(s.nextInt() == 9) {
            subLevel = -1;
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
        System.out.println("\n Press 9 to go back.");
        if(s.nextInt() == 9) {
            subLevel = -1;
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
        System.out.println("\n Press 9 to go back.");
        if(s.nextInt() == 0) {
            subLevel = -1;
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
        System.out.println("\nPress 9 to go back.");
        if(s.nextInt() == 9) {
            subLevel = -1;
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
        System.out.println("\nPress 9 to go back.");
        if(s.nextInt() == 9) {
            subLevel = -1;
        } else {
            System.out.println("Invalid input.");
        }
    }

    public void run() {
        while (true) {
            if (mainLevel == -1) {
                subLevel = -1;
                printMainMenu();
                mainLevel = s.nextInt();
            } else if (mainLevel == 0) {
                if (subLevel == -1) {
                    printNotebookMenu();
                    int userInput = s.nextInt();
                    if(notebookMenuItems[userInput] == null) {
                        System.out.println("Invalid input.");
                    } else {
                        subLevel = userInput;
                    }
                    /*switch (s.nextInt()) {
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
                    }*/
                }
                if(subLevel == 0) {
                    addNotebookMenu();
                }
                if(subLevel == 1) {
                    listNotebooksMenu();
                }
                if(subLevel == 2) {
                    u.printBrandList();
                    System.out.println("Brand ID:");
                    listNotebooksByBrandMenu(s.nextInt());
                }
                if(subLevel == 3) {
                    System.out.println("Notebook ID:");
                    listNotebookByIDMenu(s.nextInt());
                }
                if(subLevel == 4) {
                    System.out.println("Notebook ID:");
                    deleteNotebook(s.nextInt());
                }
                if(subLevel == 5) {
                    subLevel = -1;
                    mainLevel = -1;
                }
                if(subLevel == 6) {
                    exit(0);
                }
            } else if (mainLevel == 1) {
                if (subLevel == -1) {
                    printCellphoneMenu();
                    int userInput = s.nextInt();
                    if(cellphoneMenuItems[userInput] == null) {
                        System.out.println("Invalid input.");
                    } else {
                        subLevel = userInput;
                    }
                }
                if(subLevel == 0) {
                    addCellphoneMenu();
                }
                if(subLevel == 1) {
                    listCellphonesMenu();
                }
                if(subLevel == 2) {
                    u.printBrandList();
                    System.out.println("Brand ID:");
                    listCellphonesByBrand(s.nextInt());
                }
                if(subLevel == 3) {
                    System.out.println("Cellphone ID:");
                    listCellphoneById(s.nextInt());
                }
                if(subLevel == 4) {
                    System.out.println("Cellphone ID:");
                    deleteCellphone(s.nextInt());
                }
                if(subLevel == 5) {
                    subLevel = -1;
                    mainLevel = -1;
                }
                if(subLevel == 6) {
                    exit(0);
                }
            } else if (mainLevel == 2) {
                new utils().printBrandList();
                System.out.println("\nPress 9 to go back.");
                if(s.nextInt() == 9) {
                    subLevel = -1;
                    mainLevel = -1;
                } else {
                    System.out.println("Invalid input.");
                }
            } else {
                exit(0);
            }
        }
    }
}
