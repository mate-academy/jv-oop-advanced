package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double hight;
    private double lowerBase;
    private double upperBase;

    public IsoscelesTrapezoid(Color color, double hight, double lowerBase, double upperBase) {
        super(color);
        this.hight = hight;
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
    }

    @Override
    public double getArea() {
        return 0.5 * hight * (lowerBase + upperBase);
    }

    @Override
    public void draw() {
        System.out.println(("Figure: Isosceles trapezoid, areа: " + getArea()
                + " sq. units, hight: " + hight + " units, lowerBase: "
                + lowerBase + " units, upperBase: " + upperBase + " units, color: " + getColor()));
    }
}
