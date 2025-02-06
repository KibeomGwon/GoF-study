package main;

import proxy.Proxy;
import proxy.RealSubject;
import proxy.Subject;

public class Application {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();

        Subject proxy1 = new Proxy(realSubject);
        Subject proxy2 = new Proxy(realSubject);

        proxy1.action1();
        proxy2.action1();

        proxy1.action2();
        proxy2.action2();
    }
}
