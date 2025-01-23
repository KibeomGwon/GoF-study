# Chain Of Responsibility
<책임 사슬>
<br>

<b>다양한 처리 방식</b>을 <b>유연</b>하게 처리할 수 있다.

### 기본 설계
<img src="img/chain-of-responsibility pattern.png">

- <b>Handler</b> : (abstract) process를 처리하고 만약 처리를 못한다면 ConcreteHandler에게 처리를 맡김.
- <b>ConcreteHandler</b> : Handler를 상속받은 클래스, Handler에서 처리못한 process를 받아와서 처리함.

### 예제
사칙연산 프로그램