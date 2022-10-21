package structure.adapter.before;

public class Client {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        // 특정 시스템에 Duck이 아닌 Turkey를 사용하고자 하는데, Duck이 이미 많은 사용자가 사용하고 있는 상황이라면?

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
