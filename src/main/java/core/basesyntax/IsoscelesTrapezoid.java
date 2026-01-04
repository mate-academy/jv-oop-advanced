package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseTop;
    private double baseBottom;
    private double height;

    public IsoscelesTrapezoid(double baseTop, double baseBottom, double height, String color) {

        this.baseTop = baseTop;
        this.baseBottom = baseBottom;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return ((baseBottom + baseTop) * height) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + String.format(java.util.Locale.US,"%.2f", getArea())
                + " sq. units, baseTop: "
                + baseTop
                + " units, baseBottom: "
                + baseBottom
                + " units, height: "
                + height
                + " units, color: "
                + color);
    }
}
