package core.basesyntax.figures;

public class Circle extends Figures {
    private static final int CALCULATION_CONSTANT = 10;
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.ceil((Math.PI * radius * radius) * CALCULATION_CONSTANT) / CALCULATION_CONSTANT;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                           + " sq.units, radius: " + radius
                           + " " + unitOrUnits(radius) + ", color: "
                           + getColor().name().toLowerCase());
    }
}
