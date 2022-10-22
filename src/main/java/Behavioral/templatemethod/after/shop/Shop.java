package Behavioral.templatemethod.after.shop;

public abstract class Shop {

    public final void prepare() {
        clean();
        check();
    }

    private void clean() {
        System.out.println("Cleaning");
    }

    protected abstract void check();
}

class Supermarket extends Shop {

    @Override
    protected void check() {
        System.out.println("재고 확인");
    }
}