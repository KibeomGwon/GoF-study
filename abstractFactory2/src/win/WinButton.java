package win;

import abst.Button;

public class WinButton implements Button {
    @Override
    public void click() {
        System.out.println("Win 버튼이 클릭되었습니다.");
    }
}
