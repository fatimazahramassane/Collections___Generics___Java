import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Product> {

    private List<Product> products = new ArrayList<>();

    @Override
    public void add(Product o) {
        products.add(o);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product findById(long id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void delete(long id) {
        Product toRemove = null;
        for (Product p : products) {
            if (p.getId() == id) {
                toRemove = p;
                break;
            }
        }
        if (toRemove != null) {
            products.remove(toRemove);
            System.out.println("Product deleted.");
        } else {
            System.out.println("Product not found.");
        }
    }
}
