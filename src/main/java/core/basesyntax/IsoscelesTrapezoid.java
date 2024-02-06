package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstSide;
    private final double secondSide;
    private final double height;

    public IsoscelesTrapezoid(String color, double firstSide, double secondSide, double height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstSide * secondSide) / (height * 2);
    }

    @Override
    public void display() {
        System.out.println("Figure: Isosceles trapezoid, area: " + getArea()
                + " sq.units, firstSide: " + firstSide
                + ", secondSide: " + secondSide
                + ", height: " + height
                + ", color: " + getColor());
    }
}
