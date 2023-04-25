package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int upperBase;
    private final int lowerBase;
    private final int height;

    public IsoscelesTrapezoid(String color, int upperBase, int lowerBase, int height) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((upperBase + lowerBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + getArea()
                + " sq.units, upperBase: " + upperBase
                + " units, lowerBase: " + lowerBase
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}
