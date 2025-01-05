package template;

abstract public class AbstGameConnectionHelper {
    abstract protected String doSecurity(String string);

    abstract protected boolean authentication(String id, String password);

    abstract protected int authorization(String username);

    abstract protected String connection(String info);

    public String requestConnection(String encodedInfo) {
        // 보안 작업 -> 암호화된 문자열을 복호화한다.
        String decodedInfo =  doSecurity(encodedInfo);
        // 반환된 것을 가지고 아이디, 암호를 할당한다. -> 임시로 아래처럼 구성
        String id = "aaa";
        String password = "bbb";
        if(!authentication(id, password)) return "로그인에 실패했습니다";
        String username = "aaa's name";
        switch (authorization(username)) {
            case 1:
                System.out.println(1 + " " + username);
                break;
            case 2:
                break;
            default:
                break;
        }
        return connection("id: " + id + " 로그인했습니다.");
    }
}
