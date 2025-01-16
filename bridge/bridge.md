# Bridge Pattern

- 브릿지 패턴에 대해서 이해
- 어댑터 패턴과 브릿지 패턴을 연결하여 이해
### 키워드
기능 부분과 구현 부분 분리

MorseCode를 생성할 때 필요한 객체 주입을 <b>메인</b>에서 객체를 받고 PrintMorseCode에서 주입을 받아 morseCode객체를 생성한다.

- 메인에서 객체를 받는다.
```
public class Main {
    public static void main(String[] args) {
        PrintMorseCode printMs = new PrintMorseCode(new SoundMSF());
        printMs.A().B().C();
    }
}
```

- PrintMosreCode에서 주입을 받아 생성된다.
```
public class PrintMorseCode {
    private MorseCode morseCode;

    public PrintMorseCode(MorseCodeFunction function) {
        this.morseCode = new MorseCode(function);
    }
}
```