package with_bridge;

import with_bridge.MorseCode;

public class PrintMoseCode {
    private MorseCode morseCode;

    public PrintMoseCode(MorseCodeFunction function) {
        this.morseCode = new MorseCode(function);
    }

    public PrintMoseCode A() {
        morseCode.dot();
        morseCode.dash();
        morseCode.space();
        return this;
    }

    public PrintMoseCode B() {
        morseCode.dash();
        morseCode.dot();
        morseCode.dot();
        morseCode.dot();
        morseCode.space();
        return this;
    }

    public PrintMoseCode C() {
        morseCode.dash();
        morseCode.dot();
        morseCode.dash();
        morseCode.dot();
        morseCode.space();
        return this;
    }
}
