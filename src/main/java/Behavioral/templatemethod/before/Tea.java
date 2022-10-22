package Behavioral.templatemethod.before;

public class Tea {

    // 티를 만드는 절차
    void prepareRecipe() {
        boilWater();
        SteepingTeaBag();
        pourInCup();
        addLemon();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void SteepingTeaBag() {
        System.out.println("Steeping the tea");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void addLemon() {
        System.out.println("Add Lemon");
    }
}
