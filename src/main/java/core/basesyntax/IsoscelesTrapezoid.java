package core.basesyntax;

public class IsoscelesTrapezoid extends Shape implements Figure {
    int lowerBase;
    int upperBase;
    int highTrapezoid;

    public IsoscelesTrapezoid(int lowerBase, int upperBase, int highTrapezoid, String color) {
        super(color);
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.highTrapezoid = highTrapezoid;
    }

    public int getLowerBase() {
        return lowerBase;
    }

    public int getUpperBase() {
        return upperBase;
    }

    public int getHighTrapezoid() {
        return highTrapezoid;
    }

    public void setLowerBase(int lowerBase) {
        this.lowerBase = lowerBase;
    }

    public void setUpperBase(int upperBase) {
        this.upperBase = upperBase;
    }

    public void setHighTrapezoid(int highTrapezoid) {
        this.highTrapezoid = highTrapezoid;
    }

    @Override
    public double getArea() {
        return (lowerBase + upperBase) / 2 * highTrapezoid;
    }

    @Override
    public void draw() {
        System.out.println("Shape: Isosceles trapezoid, area = " + getArea()
                + " sq. units, lower base = " + lowerBase
                + " units, upper base = " + upperBase
                + " units, high = " + highTrapezoid
                + " units, color = " + getColor());
    }
}
