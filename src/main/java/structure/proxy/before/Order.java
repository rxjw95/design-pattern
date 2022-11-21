package structure.proxy.before;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final List<String> products = new ArrayList<>();

    public Order() {
        // heavy initialization
    }

    public void insert(String product) {
        products.add(product);
    }

    public void process() {

    }
}
