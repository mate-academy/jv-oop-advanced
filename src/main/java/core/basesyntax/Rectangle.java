
package core.basesyntax;

public class Rectangle extends GeometricFigure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " , firstSide: "
                + firstSide + ", secondSide: "
                + secondSide + ", color: "
                + color);
    }
}
