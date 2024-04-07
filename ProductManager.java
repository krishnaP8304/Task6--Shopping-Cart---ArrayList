import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<String> products;
    private Scanner scanner;

    public ProductManager() {
        products = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void start() {
        int choice;
        do {
            System.out.println("1. Add");
            System.out.println("2. Display");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayProducts();
                    break;
                case 3:
                    System.out.println("Thank you for using the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private void addProduct() {
        System.out.print("Enter the product: ");
        String product = scanner.nextLine();
        products.add(product);
    }

    private void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products added yet.");
        } else {
            System.out.println("List of products:");
            for (String product : products) {
                System.out.println(product);
            }
        }
    }

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        manager.start();
    }
}
