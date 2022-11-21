package structure.proxy.after;

public class Main {
    public static void main(String[] args) {
        Orderable order = new OrderProxy(new Order());
        order.insert("apple");

        Orderable orderLazyLoad = new OrderProxyLazyLoad();
        orderLazyLoad.insert("apple");
    }
}
