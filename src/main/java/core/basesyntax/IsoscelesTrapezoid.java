package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int lowerBase;
    private int upperBase;
    private int high;

    public IsoscelesTrapezoid(int lowerBase, int upperBase, int high, String color) {
        super(color);
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.high = high;
    }

    @Override
    public void draw() {
        System.out.println("Shape: Isosceles trapezoid, area = " + findArea()
                + " sq. units, lower base = " + lowerBase
                + " units, upper base = " + upperBase
                + " units, high = " + high
                + " units, color = " + getColor());

    }

    @Override
    public double findArea() {
        return (lowerBase + upperBase) / 2 * high;
    }
}
