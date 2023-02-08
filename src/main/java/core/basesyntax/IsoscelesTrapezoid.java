package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private double baseA;
    private double baseB;
    private double height;

    public IsoscelesTrapezoid(String color, double baseA, double baseB, double height) {
        super("Isosceles trapezoid", color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public String draw() {
        return String.format("Figure: %s, area: %.1f sq.units, base A: %.0f units, "
                        + "base B: %.0f units, height: %.0f units, color: %s",
                getType(),area(),baseA,baseB,height,getColor());
    }

    @Override
    public double area() {
        return (baseA + baseB) / 2 * height;
    }
}
