# Builder Pattern 2

많은 인자를 가진 객체의 생성을 다른 객체의 도움으로 생성하는 패턴

lombok 라이브러리의 @Builder와 같은 동작을 함.
<br>

### Ex)
```
SomeObject createdObj = Builder.builder()
                                .setField1()
                                .setField2()
                                .build();
```