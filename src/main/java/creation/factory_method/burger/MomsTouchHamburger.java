package creation.factory_method.burger;

import creation.factory_method.Hamburger;

public class MomsTouchHamburger extends Hamburger {

    private final String name;

    public MomsTouchHamburger(String name) {
        this.name = name;
    }

    @Override
    public String getBrand() {
        return "MomsTouch";
    }

    @Override
    public String getName() {
        return name;
    }

}
