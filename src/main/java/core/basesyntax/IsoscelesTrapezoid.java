package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int longerBase;
    private final int shorterBase;
    private final int height;

    public IsoscelesTrapezoid(String color, int longerBase, int shorterBase, int height) {
        super(color);
        this.longerBase = longerBase;
        this.shorterBase = shorterBase;
        this.height = height;
    }

    public double getArea() {
        return (longerBase + shorterBase) * 0.5 * height;
    }

    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, longerBase: " + longerBase + " units, shorterBase: " + shorterBase
                + " units, height: " + height + " units, color: " + getColor());
    }
}
