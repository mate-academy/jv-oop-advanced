package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Circle1", "red",5);
        circle1.getFigure();
        Square square1 = new Square("square1", "green", 4);
        square1.getFigure();
    }
}
