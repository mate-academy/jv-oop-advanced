package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double baseTop;
    private double baseBottom;

    public IsoscelesTrapezoid(String color, double height, double baseTop, double baseBottom) {
        super(color);
        this.height = height;
        this.baseTop = baseTop;
        this.baseBottom = baseBottom;
    }

    @Override
    public double getArea() {
        return (baseTop + baseBottom) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid" + ", area: "
                + getArea() + " sq.units, height: "
                + height + " units, baseTop: " + baseTop
                + " units, baseBottom: " + baseBottom
                + " units, color: " + getColor());
    }
}
