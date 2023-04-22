package Behavioral.strategy;

public class Navigator {
    private RouteStrategy routeStrategy;

    public Navigator(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void buildRoute(String src, String des) {
        routeStrategy.buildRoute(src, des);
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }
}
