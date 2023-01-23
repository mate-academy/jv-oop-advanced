package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int firstBase;
    private final int secondBase;
    private final int height;

    public IsoscelesTrapezoid(Color color, int firstBase, int secondBase, int height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double)((firstBase + secondBase) * height) / 2;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: isoscelesTrapezoid, area: "
                + getArea() + " sq.units, firstBase: "
                + firstBase + " sq.units, secondBase: "
                + secondBase + " sq.units, height: "
                + height + " units color " + getColor());
    }
}
