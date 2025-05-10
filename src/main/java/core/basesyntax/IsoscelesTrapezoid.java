package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double lowerBase;
    private double upperBase;
    private double height;

    public IsoscelesTrapezoid(String color, double lowerBase, double upperBase, double height) {
        super(color);
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (lowerBase + upperBase) / 2 * height;
    }

    @Override
    public void draw() {
        double area = (double) getArea();
        System.out.println("Figure: isosceles trapezoid, area: "
                + area + " sq. units, lower base: "
                + lowerBase + " units, upper base: "
                + upperBase + " units, height: "
                + height + " units, color: "
                + getColor().toLowerCase());
    }
}
