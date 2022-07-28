package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int longerBase;
    private int shorterBase;
    private int height;
    private double area;

    public IsoscelesTrapezoid(String color, int longerBase, int shorterBase, int height) {
        super(color);
        this.longerBase = longerBase;
        this.shorterBase = shorterBase;
        this.height = height;
        this.area = areaCalculation();
    }

    @Override
    public double areaCalculation() {
        return (shorterBase + longerBase) * height / 2F;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + this.area
                + " sq.units, longerBase: " + this.longerBase
                + " units, shorterBase: " + this.shorterBase + " units, height: "
                + this.height + " units, color: " + getColor());
    }
}
