package core.basesyntax;

public class IsoscelesTrapezoid extends Figures {
    private int lowerBase;
    private int upperBase;
    private int highTrapezoid;

    public IsoscelesTrapezoid(Colors color, int lowerBase, int upperBase, int highTrapezoid) {
        super(color);
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.highTrapezoid = highTrapezoid;
    }

    @Override
    public int getArea() {
        return (lowerBase + upperBase) / 2 * highTrapezoid;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles Trapezoid has been drawn");
    }

    @Override
    public String toString() {
        return "Shape: isosceles trapezoid, area: "
                + getArea() + " sq. units, lower base: "
                + lowerBase + " units, color: " + getColor().toLowerCase();
    }
}
