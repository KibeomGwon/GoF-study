# Flyweight Pattern

- <b>플라이 웨이트 패턴</b>을 통해 <b>메모리 공간</b>을 절약할 수 있다.

### 키워드
<b>메모리</b>

### 기본설계
<img src="img/flyweight%20pattern.png">

- flyweight 객체를 client가 직접 다루는 것이 아니라 factory 같은 manager를 통해 다루는 것 


### 예제
client가 똑같은 img가 필요할 때마다 객체를 만들어 내는 것은 메모리를 많이 잡아먹는다.
<br>
따라서 image manager 라는 manager 를 만들어서 이미지를 관리하게 한다.
<br>
그렇게 되면 똑같은 이미지를 필요할 때마다 이미 생성되어 있는 객체를 받아와서 사용하게 된다.