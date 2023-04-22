package creation.factory_method.burger;

import creation.factory_method.Hamburger;

public class BurgerKingHamburger extends Hamburger {

    private final String name;

    public BurgerKingHamburger(String name) {
        this.name = name;
    }

    @Override
    public String getBrand() {
        return "BurgerKing";
    }

    @Override
    public String getName() {
        return name;
    }
}
