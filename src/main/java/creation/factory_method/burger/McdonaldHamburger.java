package creation.factory_method.burger;

import creation.factory_method.Hamburger;

public class McdonaldHamburger extends Hamburger {

    private final String name;

    public McdonaldHamburger(String name) {
        this.name = name;
    }

    @Override
    public String getBrand() {
        return "McdonalHambuger";
    }

    @Override
    public String getName() {
        return name;
    }

}
