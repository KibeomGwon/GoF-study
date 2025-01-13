package concrete;

import abst.GuiFactory;
import linux.LinuxGuiFactory;
import mac.MacGuiFactory;
import win.WinGuiFactory;

public class FactoryInstance {

    public static GuiFactory getGuiFactory() {
        switch (getOsCode()) {
            case 0:
                return new MacGuiFactory();
            case 1:
                return new LinuxGuiFactory();
            case 2:
                return new WinGuiFactory();
        }
        return null;
    }

    private static int getOsCode() {
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("win")) {
            return 2;
        } else if (osName.contains("mac")) {
            return 0;
        }
        return 1;
    }
}
