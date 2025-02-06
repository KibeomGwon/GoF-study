package proxy;

public class Proxy implements Subject {

    private Subject real;

    public Proxy(RealSubject subject) {
        real = subject;
    }

    @Override
    public void action1() {
        System.out.println("간단한 업무 by Proxy");
    }

    @Override
    public void action2() {
        real.action2();
    }
}
