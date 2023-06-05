package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private double upperBase;
    private double lowerBase;
    private double height;

    public IsoscelesTrapezoid(String color, double upperBase, double lowerBase, double height) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    public double getArea() {
        return ((upperBase + lowerBase) * height) / 2;
    }

    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, upper base: " + upperBase
                + " units, lower base: " + lowerBase + " units, height: "
                + height + " units, color: " + color);
    }
}
