package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstBase;
    private final double secondBase;
    private final double height;

    public IsoscelesTrapezoid(Color color, double firstBase, double secondBase, double height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) / 2 * height;
    }

    @Override
    public String draw() {
        return "Figure: IsoscelesTrapezoid, "
                + "square=" + getArea() + "sq.units, firstBase="
                + firstBase + "units, secondBase="
                + secondBase + "units, height="
                + height + "units, color="
                + getColor() + '.';
    }
}

