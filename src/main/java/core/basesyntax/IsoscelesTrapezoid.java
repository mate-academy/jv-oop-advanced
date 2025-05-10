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
        return (firstSide * secondSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area "
                + getArea() + " sq.units, first side: " + firstSide
                + " units, second side: " + secondSide
                + " units, height: " + height + " color: " + color);
    }
}
