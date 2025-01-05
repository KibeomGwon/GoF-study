package prototype2;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Cat navi = new Cat();
        navi.setName("navi");

        Cat yo = navi.copy();
        yo.setName("yo");

        System.out.println(navi.getName());
        System.out.println(yo.getName());
    }
}
