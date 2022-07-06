package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double sideBase;
    private double height;

    public RightTriangle(String color, double sideBase, double height) {
        super(color);
        this.sideBase = sideBase;
        this.height = height;
    }

    public double getSideBase() {
        return sideBase;
    }

    public void setSideBase(double sideBase) {
        this.sideBase = sideBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (sideBase * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", area: " + getArea()
                + " sq.units, sideBase: " + getSideBase()
                + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }
}
