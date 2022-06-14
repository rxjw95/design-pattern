package creation.singleton;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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

    @Test
    void synchronizedSingletonInstanceTest() {
        SettingsSingleton settingsSingleton1 = SettingsSingleton.getInstance();
        SettingsSingleton settingsSingleton2 = SettingsSingleton.getInstance();

        assertSame(settingsSingleton1, settingsSingleton2);
    }

    @Test
    void earlyInitializedSingletonInstanceTest() {
        SettingsSingleton settingsSingleton1 = SettingsSingleton.getInstance();
        SettingsSingleton settingsSingleton2 = SettingsSingleton.getInstance();

        assertSame(settingsSingleton1, settingsSingleton2);
    }

    @Test
    void doubleCheckSingletonInstanceTest() {
        SettingsSingleton settingsSingleton1 = SettingsSingleton.getInstance();
        SettingsSingleton settingsSingleton2 = SettingsSingleton.getInstance();

        assertSame(settingsSingleton1, settingsSingleton2);
    }

    @Test
    void breakSingletonTest() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SettingsSingleton instance = SettingsSingleton.getInstance();

        Constructor<SettingsSingleton> constructor = SettingsSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SettingsSingleton settingsSingleton = constructor.newInstance();

        assertNotSame(instance, settingsSingleton);
    }

    @Test
    void enumSingletonTest() {
        SettingsSingletonEnum singleton1 = SettingsSingletonEnum.SINGLETON;
        SettingsSingletonEnum singleton2 = SettingsSingletonEnum.SINGLETON;

        assertSame(singleton1, singleton2);
    }
}