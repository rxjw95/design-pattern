package creation.factory_method.store;

import creation.factory_method.Hamburger;
import creation.factory_method.HamburgerStore;
import creation.factory_method.burger.MomsTouchHamburger;

public class MomsTouch extends HamburgerStore {

    @Override
    public Hamburger create(String menu) {
        return new MomsTouchHamburger(menu);
    }

}
