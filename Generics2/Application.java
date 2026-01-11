import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        MetierProduitImpl metier = new MetierProduitImpl();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== PRODUCT MANAGEMENT MENU =====");
            System.out.println("1. Display all products");
            System.out.println("2. Search product by id");
            System.out.println("3. Add new product");
            System.out.println("4. Delete product by id");
            System.out.println("5. Exit");
            System.out.print("Your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.println("\n--- Product List ---");
                    for (Product p : metier.getAll()) {
                        System.out.println(p);
                    }
                    break;

                case 2:
                    System.out.print("Enter product id: ");
                    long searchId = sc.nextLong();

                    Product found = metier.findById(searchId);
                    if (found != null) {
                        System.out.println("Found: " + found);
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter id: ");
                    long id = sc.nextLong();
                    sc.nextLine();

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter brand: ");
                    String brand = sc.nextLine();

                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter description: ");
                    String description = sc.nextLine();

                    System.out.print("Enter stock: ");
                    int stock = sc.nextInt();

                    Product p = new Product(id, name, brand, price, description, stock);
                    metier.add(p);
                    System.out.println("Product added.");
                    break;

                case 4:
                    System.out.print("Enter product id to delete: ");
                    long deleteId = sc.nextLong();
                    metier.delete(deleteId);
                    break;

                case 5:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
