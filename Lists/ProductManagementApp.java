import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagementApp {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== PRODUCT MANAGEMENT MENU =====");
            System.out.println("1. Add product");
            System.out.println("2. Delete product by index");
            System.out.println("3. Display products");
            System.out.println("4. Modify product by index");
            System.out.println("5. Search product by name");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter product id: ");
                    long id = sc.nextLong();
                    sc.nextLine();

                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter product price: ");
                    double price = sc.nextDouble();

                    products.add(new Product(id, name, price));
                    System.out.println("Product added successfully.");
                    break;

                case 2:
                    System.out.print("Enter index to delete: ");
                    int indexToDelete = sc.nextInt();

                    if (indexToDelete >= 0 && indexToDelete < products.size()) {
                        products.remove(indexToDelete);
                        System.out.println("Product deleted.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Product List ---");
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println(i + " : " + products.get(i));
                    }
                    break;

                case 4:
                    System.out.print("Enter index to modify: ");
                    int indexToModify = sc.nextInt();
                    sc.nextLine();

                    if (indexToModify >= 0 && indexToModify < products.size()) {
                        System.out.print("New name: ");
                        String newName = sc.nextLine();

                        System.out.print("New price: ");
                        double newPrice = sc.nextDouble();

                        products.get(indexToModify).setName(newName);
                        products.get(indexToModify).setPrice(newPrice);

                        System.out.println("Product updated.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 5:
                    System.out.print("Enter product name to search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;

                    for (Product p : products) {
                        if (p.getName().equalsIgnoreCase(searchName)) {
                            System.out.println("Found: " + p);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Product not found.");
                    }
                    break;

                case 0:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
