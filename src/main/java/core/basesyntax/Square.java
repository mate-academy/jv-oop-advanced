package core.basesyntax;

public class Square extends Figure {
    private double leg;

    public Square(double leg, String color) {
        super(color);
        this.leg = leg;
    }

    public double getArea() {
        return 0;
    }

    public void draw() {
        System.out.printf("Figure: square, area: %1f sq.units, "
                        + "leg: %2f units, color: %s%n", getArea(), leg, getColor());

    }
}
