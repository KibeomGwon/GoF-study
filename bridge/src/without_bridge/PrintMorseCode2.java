package without_bridge;

public class PrintMorseCode2 extends MorseCode2 {
    public PrintMorseCode2 A() {
        dot();
        dash();
        space();
        return this;
    }

    public PrintMorseCode2 B() {
        dash();
        dot();
        dot();
        dot();
        space();
        return this;
    }

    public PrintMorseCode2 C() {
        dash();
        dot();
        dash();
        dot();
        space();
        return this;
    }
}
