package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseTop;
    private double baseBottom;
    private double height;

    public IsoscelesTrapezoid(String color, double baseBottom, double baseTop, double height) {
        super(color);
        this.baseBottom = baseBottom;
        this.baseTop = baseTop;
        this.height = height;
    }

    public double getBaseTop() {
        return baseTop;
    }

    public double getBaseBottom() {
        return baseBottom;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return height * (baseTop + baseBottom) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq.units, baseTop: " + getBaseTop() + " units, baseBottom: "
                + getBaseBottom() + " units, height: "
                + getHeight() + " units, color: " + getColor());
    }
}
