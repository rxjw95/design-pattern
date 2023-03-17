package solid.dip.valid.low;

import solid.dip.valid.high.HighLevelService;

public class LowLevelClass implements HighLevelService {

    private final LowLevelService lowLevelService;

    public LowLevelClass(LowLevelService lowLevelService) {
        this.lowLevelService = lowLevelService;
    }

    @Override
    public void createTemplate() {
        System.out.println("템플릿을 만든다.");

    }

    @Override
    public void fillContent() {
        System.out.println("메세지를 채운다.");
    }

    @Override
    public void send() {
        System.out.println("메시지를 보낸다.");
        lowLevelService.send();
    }
}
