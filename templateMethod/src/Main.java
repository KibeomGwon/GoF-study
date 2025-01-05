import template.AbstGameConnectionHelper;

public class Main {
    public static void main(String[] args) {
        AbstGameConnectionHelper helper = new GameConnector();
        String result = helper.requestConnection("aabbbssss");
        System.out.println(result);
    }
}
