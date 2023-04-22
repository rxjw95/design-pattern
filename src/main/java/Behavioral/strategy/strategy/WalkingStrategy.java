package Behavioral.strategy.strategy;

import Behavioral.strategy.RouteStrategy;

public class WalkingStrategy implements RouteStrategy {

    @Override
    public void buildRoute(String src, String des) {
        System.out.printf("%s에서 %s까지 도보로 걸어가는 경로를 안내합니다.%n", src, des);
    }
}
