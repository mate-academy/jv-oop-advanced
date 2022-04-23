package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Figure x = new Figure();
        System.out.println(x.toString());
        Figure y = new Square(10);
        System.out.println(y.toString());
    }
}
