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
        return (upperBase + bottomBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + this.getArea()
                + " sq.units, leg1: " + this.upperBase
                + " units, leg2: " + this.bottomBase
                + " units, height: " + this.height
                + " units, color: " + this.color);
    }
}
