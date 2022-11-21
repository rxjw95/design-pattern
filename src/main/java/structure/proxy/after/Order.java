package structure.proxy.after;

import java.util.ArrayList;
import java.util.List;

public class Order implements Orderable{
    private final List<String> products = new ArrayList<>();

    public Order() {
        // heavy initialization
    }


    @Override
    public void insert(String product) {
        products.add(product);
    }

    @Override
    public void process() {

    }
}
