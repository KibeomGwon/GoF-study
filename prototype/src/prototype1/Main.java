package prototype1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle1 = new Circle(1, 1, 3);
        Circle circle2 = circle1.copy();

        circle2.setX(circle1.getX() + 1);
        circle2.setY(circle1.getY() + 1);

        System.out.println(circle1.getX() + ", " + circle1.getY() + ", " + circle1.getR());
        System.out.println(circle2.getX() + ", " + circle2.getY() + ", " + circle2.getR());

    }
}
