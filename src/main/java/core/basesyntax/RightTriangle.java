package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + String.format("%.1f", calculateArea()) + " sq. units, base: "
                + String.format("%.1f", base) + " units, height: "
                + String.format("%.1f",height) + " units, color: "
                + getColor().toLowerCase());
    }
}
