package solid.dip.invalid.low;

import solid.dip.invalid.lowest.MoreLowLevelClass;

public class LowLevelClass {
    private final MoreLowLevelClass moreLowLevelClass;

    public LowLevelClass(MoreLowLevelClass moreLowLevelClass) {
        this.moreLowLevelClass = moreLowLevelClass;
    }

    public void createTemplate() {
        System.out.println("템플릿을 만든다.");

    }

    public void fillContent() {
        System.out.println("메세지를 채운다.");
    }

    public void send() {
        System.out.println("메시지를 보낸다.");
        moreLowLevelClass.sendNaverMail();
    }
}
