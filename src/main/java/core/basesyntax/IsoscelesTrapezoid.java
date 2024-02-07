package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(Color color, double firstBase, double secondBase, double height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public String draw() {
        return String.format("Figure: %s, area: %.1f sq.units, base A: %.0f units, "
                        + "base B: %.0f units, height: %.0f units, color: %s",
                this.getClass().getSimpleName(), getArea(), firstBase,
                secondBase, height, getColor().name().toLowerCase());
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) / 2 * height;
    }
}
