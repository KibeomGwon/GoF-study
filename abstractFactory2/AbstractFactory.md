# AbstractFactory2

관련 있는 객체의 생성을 가상화 할 수 있다.

- abst를 상속한 gt, sam은 외부에 노출되어서는 안 된다.
    - new 키워드로 선언이 되는 등.
    - FactoryInstance 클래스의 getGuiFactory 메소드가 외부로 부터의 노출을 막아준다.
        - linux, mac, win package도 원래는 concrete 안에 있어야 한다.