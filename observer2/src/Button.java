import java.util.Observable;

public class Button extends Observable {

    public void onClick() {
        setChanged();       // 상태에 변화가 있다
        notifyObservers();
    }
}
