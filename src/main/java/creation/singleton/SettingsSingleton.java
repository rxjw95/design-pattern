package creation.singleton;

public class SettingsSingleton {

    private static SettingsSingleton singleton;

    private SettingsSingleton() {}

    public static synchronized SettingsSingleton getInstance() {
        if(singleton == null) {
            singleton = new SettingsSingleton();
        }

        return singleton;
    }
}
