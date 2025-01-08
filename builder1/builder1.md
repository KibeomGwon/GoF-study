# Builder Pattern 1
복잡한 단계를 거쳐야 생성되는 객체의 구현을 서브 클래스에게 넘겨주는 패턴

<img src="./builder pattern.png">

- Director : ComputerFactory
- AbstractBulder : BludPrint
- ConcreteBulder : LgGramBluePrint
- Product : Main

### 의존 관계
- Director의 field에서 AbstractBuilder에 의존하고 있다.
- ConcreteBuilder가 AbstractBuilder에 상속 의존하고 있다.
