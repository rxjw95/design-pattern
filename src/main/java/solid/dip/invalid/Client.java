package solid.dip.invalid;

import solid.dip.invalid.high.HighLevelClass;
import solid.dip.invalid.low.LowLevelClass;
import solid.dip.invalid.lowest.MoreLowLevelClass;

public class Client {
    public static void main(String[] args) {
        HighLevelClass highLevelClass = new HighLevelClass(new LowLevelClass(new MoreLowLevelClass()));
        System.out.println("High level class는 저수준 모듈에 강하게 결합되어 있다.");
        System.out.println("High level class를 다른 시스템에서 재사용하기 위해 떼어내려고 했으나, 이미 구체적인 것에 의존하고 있다.");
    }
}
