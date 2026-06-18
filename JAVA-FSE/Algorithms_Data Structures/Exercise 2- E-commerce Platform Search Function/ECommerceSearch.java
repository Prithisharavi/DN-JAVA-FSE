class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public void display() {
        System.out.println(productId + " " + productName + " " + category);
    }
}

public class ECommerceSearch {

    public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String name) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = products[mid].productName.compareToIgnoreCase(name);

            if (result == 0)
                return products[mid];
            else if (result < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Keyboard", "Electronics"),
            new Product(102, "Laptop", "Electronics"),
            new Product(103, "Mobile", "Electronics"),
            new Product(104, "Mouse", "Electronics"),
            new Product(105, "Printer", "Electronics")
        };

        System.out.println("Linear Search Result:");
        Product p1 = linearSearch(products, "Mobile");

        if (p1 != null)
            p1.display();
        else
            System.out.println("Product Not Found");

        System.out.println("\nBinary Search Result:");
        Product p2 = binarySearch(products, "Mobile");

        if (p2 != null)
            p2.display();
        else
            System.out.println("Product Not Found");
    }
}