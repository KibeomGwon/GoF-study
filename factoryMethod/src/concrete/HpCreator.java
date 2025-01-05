package concrete;

import framework.Item;
import framework.ItemCreator;

public class HpCreator extends ItemCreator {
    @Override
    protected void requestItemsInfo() {
        System.out.println("데이터 베이스에서 아이템 정보를 불러옵니다.");
    }

    @Override
    protected void createItemLog() {
        System.out.println("회복 물략을 새로 생성했습니다");
    }

    @Override
    protected Item createItem() {
        return new HpPotion();
    }
}
