package solid.dip.valid.low;

import solid.dip.valid.high.HighLevelService;

public class AnotherSystemLowLevelClass implements HighLevelService {
    @Override
    public void createTemplate() {
        System.out.println("다른 시스템에서의 템플릿 사용");
    }

    @Override
    public void fillContent() {
        System.out.println("다른 시스템에서의 컨텐츠 등록");
    }

    @Override
    public void send() {
        System.out.println("다른 시스템에서의 메시지 보내기");
    }
}
