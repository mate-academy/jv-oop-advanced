package core.basesyntax;

public class RightTriangle extends Figure {
    private static final double HALF = 0.5;
    private int base;
    private int height;

    RightTriangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return HALF * base * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, area: " + getArea()
                + " sq. units, base: " + base
                + " , height: " + height + " units, color: " + getColor());
    }
}
