package structure.proxy.after;

public class OrderProxyLazyLoad implements Orderable{
    private Order order;    // 프록시 생성시 원본은 초기화하지 않음

    @Override
    public synchronized void insert(String product) {
        if(order != null) {
            createInstance();
            System.out.printf("Log: [%s]를 담았습니다.%n", product);
            order.insert(product);
        }
    }

    @Override
    public void process() {
        if(order != null) {
            createInstance();
            long before = System.currentTimeMillis();
            order.process();
            System.out.printf("Log: process time is %d ms\n", System.currentTimeMillis() - before);
        }
    }

    private synchronized void createInstance() {
        if(order != null) {
            order = new Order();
        }
    }
}
