package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperBase;
    private int lowerBase;
    private int trapezoidSide;

    public IsoscelesTrapezoid(String color, int upperBase, int lowerBase, int trapezoidSide) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.trapezoidSide = trapezoidSide;
    }

    @Override
    public double getArea() {
        return (upperBase + lowerBase) / 4 * Math.sqrt(4 * Math.pow(trapezoidSide, 2)
                - Math.pow(upperBase - lowerBase, 2));
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, upperBase = " + upperBase
                + ", lowerBase = " + lowerBase + ", trapezoidSide " + trapezoidSide
                + ", area = " + getArea() + ", color: " + getRandomColor());
    }
}
