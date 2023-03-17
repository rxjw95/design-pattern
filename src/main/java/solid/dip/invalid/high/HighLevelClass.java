package solid.dip.invalid.high;

import solid.dip.invalid.low.LowLevelClass;

public class HighLevelClass {
    private final LowLevelClass lowLevelClass;

    public HighLevelClass(LowLevelClass lowLevelClass) {
        this.lowLevelClass = lowLevelClass;
    }

    public void sendMessage() {
        System.out.println("메세지를 보낸다.");
        lowLevelClass.createTemplate();
        lowLevelClass.fillContent();
        lowLevelClass.send();
    }
}
