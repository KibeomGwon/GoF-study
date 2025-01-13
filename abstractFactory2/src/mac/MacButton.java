package mac;

import abst.Button;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Mac Button이 클릭되었습니다.");
    }
}
