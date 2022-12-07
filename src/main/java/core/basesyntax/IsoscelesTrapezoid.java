package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double highBase;
    private double lowBase;
    private double height;

    public IsoscelesTrapezoid(String color, double highBase, double lowBase, double height) {
        super(color);
        this.highBase = highBase;
        this.lowBase = lowBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (highBase + lowBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, "
                            + "area: " + String.format("%.2f", getArea()) + " sq.units, "
                            + "highBase: " + highBase + " units, "
                            + "lowBase: " + lowBase + " units, "
                            + "height: " + height + " units, "
                            + "color: " + getColor() + ".");
    }
}
