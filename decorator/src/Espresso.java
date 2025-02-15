
// concrete decorator
public class Espresso extends AbstAdding {

    static protected int espressoCount = 0;

    // super를 이용했기 때문에
    public Espresso(IBeverage material) {
        super(material);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + getAddPrice();
    }

    private static int getAddPrice() {
        espressoCount += 1;
        int addPrice = 100;

        if (espressoCount > 1) {
            addPrice = 70;
        }
        System.out.println(espressoCount);
        return addPrice;
    }
}
