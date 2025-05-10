package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperBase;
    private double lowerBase;
    private double height;

    public IsoscelesTrapezoid(String color, double base, double trapezoidHeight) {
        super(color);
        this.upperBase = base;
        this.lowerBase = base;
        this.height = trapezoidHeight;
    }

    @Override
    public double calculateArea() {
        return (lowerBase + upperBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: "
                + calculateArea()
                + " sq.units, upperBase: "
                + upperBase
                + " units, lowerBase: "
                + lowerBase
                + " units, height: "
                + height
                + ", color: "
                + getColor());
    }
}
