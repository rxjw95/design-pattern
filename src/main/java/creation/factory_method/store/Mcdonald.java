package creation.factory_method.store;

import creation.factory_method.Hamburger;
import creation.factory_method.HamburgerStore;
import creation.factory_method.burger.McdonaldHamburger;

public class Mcdonald extends HamburgerStore {

    @Override
    protected Hamburger create(String menu) {
        return new McdonaldHamburger(menu);
    }
}
