package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int longerBase;
    private int shorterBase;
    private int height;

    public IsoscelesTrapezoid(String color, int longerBase, int shorterBase, int height) {
        super(color);
        this.longerBase = longerBase;
        this.shorterBase = shorterBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (shorterBase + longerBase) * height / 2F;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, longerBase: " + this.longerBase
                + " units, shorterBase: " + this.shorterBase + " units, height: "
                + this.height + " units, color: " + getColor());
    }
}
