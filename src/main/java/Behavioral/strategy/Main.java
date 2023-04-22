package Behavioral.strategy;

import Behavioral.strategy.strategy.PublicTransportStrategy;
import Behavioral.strategy.strategy.WalkingStrategy;

public class Main {

    public static void main(String[] args) {
        Navigator navigator = new Navigator(new PublicTransportStrategy());
        navigator.buildRoute("하남시", "성남시");

        navigator.setRouteStrategy(new WalkingStrategy());
        navigator.buildRoute("성남시", "서울특별시");
    }

}
