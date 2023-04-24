package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int upperBase;
    private final int lowerBase;
    private final int rib;

    public IsoscelesTrapezoid(String color, int topSize, int bottomSize, int sideSize) {
        super(color);
        this.upperBase = topSize;
        this.lowerBase = bottomSize;
        this.rib = sideSize;
    }

    public int getUpperBase() {
        return upperBase;
    }

    public int getLowerBase() {
        return lowerBase;
    }

    public int getRib() {
        return rib;
    }

    @Override
    public double getArea() {
        return 0.5 * (upperBase + lowerBase)
                * Math.pow((rib * rib - Math.pow(0.5 * (lowerBase - upperBase),2)), 0.5);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: "
                + getArea()
                + " sq.units, upper base: "
                + getUpperBase()
                + " units, lower base: "
                + getLowerBase()
                + " units, rib: "
                + getRib()
                + " units, color: "
                + getColor().toLowerCase());
    }
}
