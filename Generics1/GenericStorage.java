import java.util.ArrayList;
import java.util.List;

public class GenericStorage<T> {

    private List<T> elements;

    public GenericStorage() {
        elements = new ArrayList<>();
    }

    // Add element
    public void addElement(T o) {
        elements.add(o);
    }

    // Remove element by index
    public void removeElement(int index) {
        if (index >= 0 && index < elements.size()) {
            elements.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Get element by index
    public T getElement(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        } else {
            System.out.println("Invalid index.");
            return null;
        }
    }

    // Get size
    public int getSize() {
        return elements.size();
    }

    // Display all elements
    public void displayAll() {
        System.out.println("Elements in storage:");
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(i + " : " + elements.get(i));
        }
    }
}
