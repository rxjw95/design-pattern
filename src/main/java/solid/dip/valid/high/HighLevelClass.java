package solid.dip.valid.high;

public class HighLevelClass {

    private final HighLevelService highLevelService;

    public HighLevelClass(HighLevelService highLevelService) {
        this.highLevelService = highLevelService;
    }

    public void sendMessage() {
        highLevelService.createTemplate();
        highLevelService.fillContent();
        highLevelService.send();
    }
}
