package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double longBase;
    private final double shortBase;
    private final double leg;

    public IsoscelesTrapezoid(Color color, double longBase, double shortBase, double leg) {
        super(color);
        if (!FigureDimensionsValidator.isValidDimensions(longBase, shortBase, leg)) {
            throw new FigureDimensionError(this.getClass().getSimpleName());
        }
        this.longBase = longBase;
        this.shortBase = shortBase;
        this.leg = leg;
    }

    @Override
    public double getArea() {
        double projection = (longBase - shortBase) / 2;
        double height = Math.sqrt(leg * leg - projection * projection);
        return ((longBase + shortBase) * height) / 2;
    }

    @Override
    public String draw() {
        return super.draw() + " { longBase: " + longBase + " units, shortBase: "
                + shortBase + " units, leg: " + leg + " units, area: " + getArea()
                + " square units, color: " + getColor() + " }";
    }
}
