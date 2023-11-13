package core.basesyntax;

public class RightTriangle extends Figure {
    private final double base;
    private final double height;

    public RightTriangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, "
                + "area : " + getArea()
                + " sq.units, "
                + " firstLeg: " + getBase()
                + " units, secondLeg: " + getHeight()
                + " units" + " color:" + getColor());
    }

    @Override
    public double getArea() {
        return (height * base) / 2;
    }
}
