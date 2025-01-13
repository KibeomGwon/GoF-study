package win;

import abst.Button;
import abst.GuiFactory;
import abst.TextArea;

public class WinGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextArea createTextArea() {
        return new WinTextArea();
    }
}
