package creation.singleton;

public class SettingsSingleton {

    private static volatile SettingsSingleton singleton;

    private SettingsSingleton() {}

    public static SettingsSingleton getInstance() {
        if(singleton == null) {
            synchronized (SettingsSingleton.class) {
                if(singleton == null) {
                    singleton = new SettingsSingleton();
                }
            }
        }
        return singleton;
    }
}
