package core.basesyntax;

public class IsoscelesTrapezoid extends GeometricFigure {
    private final int height;
    private final int firstBase;
    private final int secondBase;

    public IsoscelesTrapezoid(int height, int firstBase, int secondBase, String color) {
        super(color);
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    @Override
    public double getArea() {
        return (double) ((firstBase + secondBase) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea()
                + ", height: " + height
                + ", first Base: " + firstBase
                + ", secondBase: "
                + secondBase
                + ", color: " + color);
    }
}
