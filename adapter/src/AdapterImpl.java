import Math.Math;

public class AdapterImpl implements Adapter {

    @Override
    public Float twiceOf(Float num) {
        return Math.doubled(num.doubleValue()).floatValue();
    }

    @Override
    public Float halfOf(Float num) {
        System.out.println("half 함수 호출"); // 추가된 요구사함
        return (float) Math.half(num.doubleValue());
    }
}
