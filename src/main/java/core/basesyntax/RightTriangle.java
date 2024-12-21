package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public String printInformation() {
        return "Figure: RightTriangle, area: " + getArea()
                + "sq. units, base: " + base + " units, height: "
                + height + " units, color: " + getColor();
    }
}
