package structure.adapter.after;

public class Client {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.fly();
    }
}

interface Duck {
    public void quack();
    public void fly();
}

class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }

    @Override
    public void fly() {
        System.out.println("오리 날다.");

    }
}
