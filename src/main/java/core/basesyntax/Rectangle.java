package core.basesyntax;

public class Rectangle {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB, String color) {
        double area = sideA * sideB;
        Draw draw = new Draw();
        draw.draw("rectangle", area, "sideA: " + sideA + ", sideB: " + sideB, color);
    }
}
