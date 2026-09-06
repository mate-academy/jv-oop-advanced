package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperBase;
    private int lowerBase;
    private int height;

    public IsoscelesTrapezoid(String color, int upperBase, int lowerBase, int height) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((upperBase + lowerBase) * height) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, upperBase: " + upperBase
                + " units, lowerBase: " + lowerBase
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}
