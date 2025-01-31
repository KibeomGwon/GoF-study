import java.util.Observable;
import java.util.Observer;

public class Application {
    public static void main(String[] args) {
        Button button = new Button();
        // observer를 익명으로 선언
        button.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println(o + " is Clicked");
            }
        });

        button.onClick();
        button.onClick();
        button.onClick();
    }
}
