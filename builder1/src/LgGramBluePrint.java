
// ConcreteBuilder
public class LgGramBluePrint extends BluePrint {

    private Computer computer;

    public LgGramBluePrint() {
        computer = new Computer("default", "default", "default");
    }

    @Override
    void setCpu() {
        computer.setCpu("i7");
    }

    @Override
    void setRam() {
        computer.setRam("16g");
    }

    @Override
    void setStorage() {
        computer.setStorage("256g ssd");
    }

    @Override
    Computer getComputer() {
        return computer;
    }
}
