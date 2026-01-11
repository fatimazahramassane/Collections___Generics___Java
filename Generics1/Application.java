public class Application {

    public static void main(String[] args) {

        // Test with Integer
        GenericStorage<Integer> intStorage = new GenericStorage<>();
        intStorage.addElement(10);
        intStorage.addElement(20);
        intStorage.addElement(30);

        System.out.println("=== Integer Storage ===");
        intStorage.displayAll();
        System.out.println("Element at index 1: " + intStorage.getElement(1));
        intStorage.removeElement(0);
        intStorage.displayAll();

        // Test with String
        GenericStorage<String> stringStorage = new GenericStorage<>();
        stringStorage.addElement("Hello");
        stringStorage.addElement("World");

        System.out.println("\n=== String Storage ===");
        stringStorage.displayAll();
        System.out.println("Element at index 0: " + stringStorage.getElement(0));
        stringStorage.removeElement(1);
        stringStorage.displayAll();

        // Test with Double
        GenericStorage<Double> doubleStorage = new GenericStorage<>();
        doubleStorage.addElement(5.5);
        doubleStorage.addElement(10.2);

        System.out.println("\n=== Double Storage ===");
        doubleStorage.displayAll();
        System.out.println("Storage size: " + doubleStorage.getSize());
    }
}
