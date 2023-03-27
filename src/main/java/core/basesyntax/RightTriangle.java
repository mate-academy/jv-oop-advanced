package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public RightTriangle(int firstSide, int secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + String.format("%.2f", getArea())
                + ", first side: " + firstSide + ", second side:" + secondSide
                + ", color: " + color);
    }

    @Override
    public double getArea() {
        return (double) firstSide * secondSide / 2;
    }
}
