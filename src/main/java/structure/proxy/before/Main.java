package structure.proxy.before;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();  // 직접 객체 접근
        order.insert("apple");
        order.process();
    }
}
