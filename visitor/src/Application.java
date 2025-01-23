import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;



import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Application {
    public static void main(String[] args) {

        List<Visitable> visitables = new ArrayList<>();

        visitables.add(new VisitableA(1));
        visitables.add(new VisitableA(2));
        visitables.add(new VisitableA(3));
        visitables.add(new VisitableA(4));
        visitables.add(new VisitableA(5));

        Visitor visitor = new VisitorA();

        for (Visitable visitable : visitables) {
            visitable.accept(visitor);
        }

        System.out.println(((VisitorA) visitor).getAgeSum());
    }
}


