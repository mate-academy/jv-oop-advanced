package core.basesyntax;

public class RightTriangle extends Figure {
    private double legHeight;
    private double legBase;

    public RightTriangle(double legHeight, double legBase, String color) {
        this.legHeight = legHeight;
        this.legBase = legBase;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (legBase * legHeight) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + String.format("%.2f", getArea()) + " sq.units, "
                + "legHeight: " + String.format("%.2f", legHeight)
                + " units, legBase: " + String.format("%.2f", legBase)
                + " units, color: " + color);

    }
}
