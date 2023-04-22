package creation.factory_method.store;

import creation.factory_method.burger.BurgerKingHamburger;
import creation.factory_method.Hamburger;
import creation.factory_method.HamburgerStore;

public class BurgerKing extends HamburgerStore {

    @Override
    protected Hamburger create(String menu) {
        return new BurgerKingHamburger(menu);
    }

}
