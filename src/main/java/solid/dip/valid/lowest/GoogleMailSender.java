package solid.dip.valid.lowest;

import solid.dip.valid.low.LowLevelService;

public class GoogleMailSender implements LowLevelService {
    @Override
    public void send() {
        System.out.println("google mail로 전달");
    }
}
