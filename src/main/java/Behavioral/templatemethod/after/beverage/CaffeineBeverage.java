package Behavioral.templatemethod.after.beverage;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();     // 서브클래스에서 구체화
        pourInCup();// 서브클래스에서 구체화
        addCondiments();
    }

    abstract protected void brew();
    abstract protected void addCondiments();

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
