package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        new IsoscelesTrapezoid(Color.BLACK,10,8,5).draw();
        new Circle(Color.BLACK,6).draw();
        new Rectangle(Color.BLACK,4, 6).draw();
        new RightTriangle(Color.BLACK,3, 5,4).draw();
    }
}
