package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int lengthOfUpperBase;
    private int lengthOfLowerBase;
    private int height;

    public IsoscelesTrapezoid(String color, int lengthOfUpperBase,
                              int lengthOfLowerBase, int height) {
        super(color);
        this.lengthOfUpperBase = lengthOfUpperBase;
        this.lengthOfLowerBase = lengthOfLowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((lengthOfUpperBase + lengthOfLowerBase) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: " + getArea()
                + " sq.units, length of upper base: " + lengthOfUpperBase
                + ", length of lower base: " + lengthOfLowerBase + ", height: " + height
                + ", color: " + getColor());
    }
}
