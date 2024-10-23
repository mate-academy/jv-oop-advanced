package core.basesyntax;

public class RightTriangle extends Figure {
    private int height;
    private int base;

    public RightTriangle(int height, int base, String color) {
        super(color);
        this.height = height;
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public int getBase() {
        return base;
    }

    @Override
    public double getArea() {
        return (getBase() * getHeight()) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + "sq. units, height: " + getHeight() + "units, base: " +
                getBase() + ", color: " + getColor());

    }
}
