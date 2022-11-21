package structure.proxy.after;

public class OrderProxy implements Orderable{
    private final Orderable order;


    public OrderProxy(Orderable order) {
        this.order = order;
    }


    @Override
    public void insert(String product) {
        System.out.printf("Log: [%s]를 담았습니다.%n", product);
        order.insert(product);
        // post process
    }

    @Override
    public void process() {
        long before = System.currentTimeMillis();
        order.process();
        System.out.printf("Log: process time is %d ms\n",System.currentTimeMillis() - before);
    }
}
