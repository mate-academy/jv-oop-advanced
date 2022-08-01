package core.basesyntax;

public class RightTriangle extends Figure {
    private final double sideBase;
    private final double sideHeight;

    public RightTriangle(String color, double sideBase, double sideHeight) {
        super(color);
        this.sideBase = sideBase;
        this.sideHeight = sideHeight;
    }

    public double getSideBase() {
        return sideBase;
    }

    public double getSideHeight() {
        return sideHeight;
    }

    @Override
    public double getArea() {
        return (sideBase * sideHeight) / 2;
    }

    @Override
    public void drawing() {
        System.out.println("Figure: Right Triangle, area: " + getArea() + ", sideBase: "
                + getSideBase() + ", sideHeight: " + getSideHeight() + ", color: " + getColor());
    }
}
