package solid.dip.valid;

import solid.dip.valid.high.HighLevelClass;
import solid.dip.valid.low.AnotherSystemLowLevelClass;
import solid.dip.valid.low.LowLevelClass;
import solid.dip.valid.lowest.GoogleMailSender;
import solid.dip.valid.lowest.KakaoMessageSender;

public class Client {
    public static void main(String[] args) {
        new HighLevelClass(new AnotherSystemLowLevelClass());

        new HighLevelClass(new LowLevelClass(new KakaoMessageSender()));
        new HighLevelClass(new LowLevelClass(new GoogleMailSender()));

        System.out.println("High Level Class는 인터페이스로 느슨한 결합이 형성되었다.");
        System.out.println("고수준 모듈은 저수준 모듈의 구체적인 것에 관심없고 기능만 사용하게 된다.");
        System.out.println("재사용 측면에서도 HighLevelClass와 그에 필요한 인터페이스만 있다면, 다른 시스템에 맞게 구현해서 사용할 수 있게 된다.");
    }
}
