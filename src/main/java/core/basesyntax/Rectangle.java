package core.basesyntax;

public class Rectangle extends Figure {
    private final double base;
    private final double leg;

    public Rectangle(Color color, double base, double leg) {
        super(color);
        if (!FigureDimensionsValidator.isValidDimensions(base, leg)) {
            throw new FigureDimensionError(this.getClass().getSimpleName());
        }
        this.base = base;
        this.leg = leg;
    }

    @Override
    public double getArea() {
        return base * leg;
    }

    @Override
    public String draw() {
        return super.draw() + " { base: " + base + " units, leg: "
                + leg + " units, area: " + getArea()
                + " square units, color: "
                + getColor() + " }";
    }
}
