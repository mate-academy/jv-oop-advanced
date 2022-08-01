package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;
    private double height;

    public RightTriangle(String color, double sideBase, double sideHeight) {
        super(color);
        this.base = sideBase;
        this.height = sideHeight;
    }

    public double getSideBase() {
        return base;
    }

    public double getSideHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, area: " + getArea() + ", sideBase: "
                + getSideBase() + ", sideHeight: " + getSideHeight() + ", color: " + getColor());
    }
}
