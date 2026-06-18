import java.util.HashMap;
class Product {
    int productId;
    String productName;
    int quantity;
    double price;
    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    public void display() {
        System.out.println("ID: " + productId +
                ", Name: " + productName +
                ", Quantity: " + quantity +
                ", Price: " + price);
    }
}
public class InventoryManagementSystem {
    static HashMap<Integer, Product> inventory = new HashMap<>();
    public static void addProduct(Product product) {
        inventory.put(product.productId, product);
        System.out.println("Product Added Successfully");
    }
    public static void updateProduct(int id, int quantity, double price) {
        Product product = inventory.get(id);
        if (product != null) {
            product.quantity = quantity;
            product.price = price;
            System.out.println("Product Updated Successfully");
        } else {
            System.out.println("Product Not Found");
        }
    }
    public static void deleteProduct(int id) {
        if (inventory.remove(id) != null) {
            System.out.println("Product Deleted Successfully");
        } else {
            System.out.println("Product Not Found");
        }
    }
    public static void searchProduct(int id) {
        Product product = inventory.get(id);
        if (product != null) {
            product.display();
        } else {
            System.out.println("Product Not Found");
        }
    }
    public static void displayProducts() {
        for (Product product : inventory.values()) {
            product.display();
        }
    }
    public static void main(String[] args) {
        addProduct(new Product(101, "Laptop", 10, 50000));
        addProduct(new Product(102, "Mouse", 25, 500));
        System.out.println("\nInventory Products:");
        displayProducts();
        System.out.println("\nSearching Product:");
        searchProduct(101);
        updateProduct(101, 15, 52000);
        System.out.println("\nAfter Update:");
        displayProducts();
        deleteProduct(102);
        System.out.println("\nAfter Delete:");
        displayProducts();
    }
}