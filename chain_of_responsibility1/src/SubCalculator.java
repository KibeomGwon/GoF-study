public class SubCalculator extends Calculator {
    @Override
    protected boolean operator(Request request) {
        if (request.getOperator().equals("-")) {
            int a = request.getA(), b = request.getB();
            System.out.println(a + " - " + b + " = " + (a - b));
            return true;
        }
        return false;
    }
}
