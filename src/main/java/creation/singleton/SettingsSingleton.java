package creation.singleton;

public class SettingsSingleton {

    private static final SettingsSingleton singleton = new SettingsSingleton();

    private SettingsSingleton() {}

    public static synchronized SettingsSingleton getInstance() {
        return singleton;
    }
}
