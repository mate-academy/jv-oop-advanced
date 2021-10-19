package core.basesyntax;

public class RightTriangle {
    private double baseTriangle;
    private double heightTriangle;

    public RightTriangle(int baseTriangle, int heightTriangle, String color) {
        double area = baseTriangle * heightTriangle / 2;
        Draw draw = new Draw();
        draw.draw("right triangle", area, "baseTriangle: " + baseTriangle
                + ", heightTriangle: " + heightTriangle, color);
    }
}
