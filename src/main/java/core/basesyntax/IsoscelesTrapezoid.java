package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int width1;
    private final int width2;

    public IsoscelesTrapezoid(int width1, int width2, String color) {
        super(color);
        this.width1 = width1;
        this.width2 = width2;
    }

    @Override
    public double getArea() {
        return ((width1 * width2) >> 1) * (width2 + width1) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, "
                + "width1: " + width1 + " units, "
                + "width2: " + width2 + " units, color: " + getColor().toLowerCase());
    }
}
