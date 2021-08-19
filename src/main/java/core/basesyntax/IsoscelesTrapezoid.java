package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;

    public IsoscelesTrapezoid(double height, String color) {
        super(color);
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %.1f sq.units,"
                + " height: %.1f units, "
                + "color: %s%n", getArea(), height, getColor());
    }

    @Override
    public double getArea() {
        return height * height;
    }
}
