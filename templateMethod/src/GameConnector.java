import template.AbstGameConnectionHelper;

public class GameConnector extends AbstGameConnectionHelper {
    @Override
    protected String doSecurity(String string) {
        System.out.println("security " + string);
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println(id + ", " + password);
        return true;
    }

    @Override
    protected int authorization(String username) {
        System.out.println("authorization " + username);
        return 1;
    }

    @Override
    protected String connection(String info) {
        System.out.println("connection complete");
        return info;
    }
}
