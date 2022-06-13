package creation.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ApplicationSingletonTest {

    @Test
    void notSingletonInstanceTest() {
        SettingsNotSingleton notSingleton1 = new SettingsNotSingleton();
        SettingsNotSingleton notSingleton2 = new SettingsNotSingleton();

        assertNotSame(notSingleton1, notSingleton2);
    }

    @Test
    void singletonInstanceTest() {
        SettingsSingleton settingsSingleton1 = SettingsSingleton.getInstance();
        SettingsSingleton settingsSingleton2 = SettingsSingleton.getInstance();

        assertSame(settingsSingleton1, settingsSingleton2);

    }
}