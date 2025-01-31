# Observer Pattern

<b>옵저버 패턴</b>을 통해 <b>이벤트 발생</b> 후 <b>객체 외부에서 처리</b>할 수 있다.

### 설계
<img src="img/Observer%20pattern1.png">

- <b>Observer</b> : Target에서 보낸 update 콜을 받아 Target의 변화를 알아차림
- <b>Target</b> : Observer를 가지고 있어 자신의 변화를 notify()로 Observer에게 알릴 수 있음.

<b>Observer가 외부에서 정의가 되는 듯하지만 실제로는 내부에서 정의가 된다.</b>