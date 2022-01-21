package core.basesyntax;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    public RightTriangle(String color, int base, int height) {
        super(color);
        this.height = height;
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double findArea() {
        return 0.5 * base * height;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure, right triangle, area " + findArea() + "sq.units, "
                + "base: " + getBase() + "height: " + getHeight() + " " + "units, " + "color: "
                +
                this.getColor());
    }
}
