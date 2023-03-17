package solid.dip.valid.lowest;

import solid.dip.valid.low.LowLevelService;

public class KakaoMessageSender implements LowLevelService {
    @Override
    public void send() {
        System.out.println("카카오톡 메시지 전달");
    }
}
