package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final double COEFFICIENT = 0.5;
    private double sideone;
    private double sidetwo;
    private double height;

    public IsoscelesTrapezoid(String color, double sideone, double sidetwo, double height) {
        super(color);
        this.sideone = sideone;
        this.sidetwo = sidetwo;
        this.height = height;
    }

    @Override
    public double getArea() {
        return COEFFICIENT * sideone * sidetwo;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: Isosceles Trapezoid, area: %.1f sq.units,"
                        + " sideone: %.1f units, sidetwo: %.1f units, color: %s\n",
                getArea(), sideone, sidetwo, getColor());
    }
}
