package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperBase;
    private int lowerBase;
    private int height;

    public IsoscelesTrapezoid(String color, int upperBase, int lowerBase, int height) {
        this.setColor(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) (upperBase + lowerBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea()
                + " sq.units, upperBase: " + upperBase + " units, lowerBase: " + lowerBase
                + " units, height: " + height + " units, color: " + getColor());
    }
}
