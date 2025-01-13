import abst.Button;
import abst.GuiFactory;
import abst.TextArea;
import concrete.FactoryInstance;
import linux.LinuxGuiFactory;
import mac.MacGuiFactory;
import win.WinGuiFactory;

public class Main {
    public static void main(String[] args) {
//        GuiFactory factory = new LinuxGuiFactory();
//        GuiFactory factory = new MacGuiFactory();
        GuiFactory factory = FactoryInstance.getGuiFactory();

        Button button = factory.createButton();
        TextArea textArea = factory.createTextArea();

        button.click();
        System.out.println(textArea.getText());
    }
}
