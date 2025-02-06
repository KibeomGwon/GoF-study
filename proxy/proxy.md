# Proxy Pattern

- <b>프록시 패턴</b>을 통해 <b>작업</b>을 나눠서 구현 할 수 있다.

### 기본 설계
<img src="img/proxy%20pattern.png">

- 클라이언트는 프록시에게 업무를 처리하게 한다.
- 프록시가 처리할 수 없는 업무는 실제 업무를 처리하는 곳 (RealSubject)에서 처리하게 한다.

