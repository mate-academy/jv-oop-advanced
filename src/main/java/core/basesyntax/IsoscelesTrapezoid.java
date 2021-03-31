package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drawable, AreaFinder {
    private int lowerBase;
    private int upperBase;
    private int highTrapezoid;

    public IsoscelesTrapezoid(int lowerBase, int upperBase, int highTrapezoid, String color) {
        super(color);
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.highTrapezoid = highTrapezoid;
    }

    @Override
    public void draw() {
        System.out.println("Shape: Isosceles trapezoid, area = " + findArea()
                + " sq. units, lower base = " + lowerBase
                + " units, upper base = " + upperBase
                + " units, high = " + highTrapezoid
                + " units, color = " + getColor());

    }

    @Override
    public double findArea() {
        return (lowerBase + upperBase) / 2 * highTrapezoid;
    }
}
