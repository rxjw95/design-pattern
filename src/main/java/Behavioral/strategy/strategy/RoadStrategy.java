package Behavioral.strategy.strategy;

import Behavioral.strategy.RouteStrategy;

public class RoadStrategy implements RouteStrategy {

    @Override
    public void buildRoute(String src, String des) {
        System.out.printf("%s에서 %s까지 도로로 이동하는 경로를 안내합니다.%n", src, des);
    }
}
