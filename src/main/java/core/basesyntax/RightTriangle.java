package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;
    private double height;

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: " + String.format("%.1f", getArea())
                + " sq. units, base: " + String.format("%.1f", base) + " units, height: "
                + String.format("%.1f", height) + " units, color: " + getColor());
    }
}
