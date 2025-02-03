package main;

import contract.Colleague;
import contract.Mediator;

public class ChatMediator extends Mediator {

    @Override
    public void mediate(String data) {
        for (Colleague colleague : colleagues) {
            colleague.handle(data);
        }
    }
}
