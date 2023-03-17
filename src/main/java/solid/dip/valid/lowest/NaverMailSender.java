package solid.dip.valid.lowest;

import solid.dip.valid.low.LowLevelService;

public class NaverMailSender implements LowLevelService {
    @Override
    public void send() {
        System.out.println("네이버 메일로 전달");
    }
}
