package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperBase;
    private int lowerBase;
    private int height;

    public IsoscelesTrapezoid(String color, int upperBase, int lowerBase, int height) {
        super(color);
        this.height = height;
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq.units, upperBase: " + upperBase + " units, lowerBase "
                + lowerBase + " units, height " + height + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (upperBase + lowerBase) * height;
    }
}
