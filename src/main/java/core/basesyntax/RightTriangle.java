package core.basesyntax;

public class RightTriangle extends Figure {
    private String name = "rightTriangle";
    private double base;
    private double height;

    public RightTriangle(double base, double height, Color color) {
        this.base = base;
        this.height = height;
        this.color = color;
    }

    public double getBisector() {
        return height;
    }

    @Override
    public double getArea() {
        return height * base / 2;
    }

    @Override
    public void draw() {
        System.out.println("Shape: " + name + ", area: " + String.format("%.1f", getArea())
                + " sq. units, bisector: " + String.format("%.1f", getBisector())
                + " units, color: " + color);
    }
}
