package creation.factory_method;

import static org.assertj.core.api.Assertions.assertThat;

import creation.factory_method.store.BurgerKing;
import creation.factory_method.store.MomsTouch;
import org.junit.jupiter.api.Test;

public class FactoryMethodTest {

    @Test
    void createBurgerKingHamburger() {
        HamburgerStore store = new BurgerKing();
        Hamburger burgerKingBurger = store.create("whopper");
        assertThat(burgerKingBurger.getBrand()).isEqualTo("BurgerKing");
        assertThat(burgerKingBurger.getName()).isEqualTo("whopper");
    }

    @Test
    void createMomsTouchHamburger() {
        MomsTouch momsTouchStore = new MomsTouch();
        Hamburger momsTouchBurger = momsTouchStore.create("Thigh Burger");
        assertThat(momsTouchBurger.getBrand()).isEqualTo("MomsTouch");
        assertThat(momsTouchBurger.getName()).isEqualTo("Thigh Burger");
    }
}
