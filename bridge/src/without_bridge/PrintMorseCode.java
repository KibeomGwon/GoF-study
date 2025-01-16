package without_bridge;

public class PrintMorseCode extends MorseCode {
    public PrintMorseCode A() {
        dot();
        dash();
        space();
        return this;
    }

    public PrintMorseCode B() {
        dash();
        dot();
        dot();
        dot();
        space();
        return this;
    }

    public PrintMorseCode C() {
        dash();
        dot();
        dash();
        dot();
        space();
        return this;
    }
}
