package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(String color, double upperBase, double bottomBase, double height) {
        super(color);
        this.upperBase = upperBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (upperBase + bottomBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, upperBase: " + upperBase + " units, bottomBase: " + bottomBase
                + " units, height: " + height + " units, color: " + getColor());
    }
}
