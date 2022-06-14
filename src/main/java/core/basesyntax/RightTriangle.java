package core.basesyntax;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    public RightTriangle(int base, int height, Color color) {
        super(color);
        this.base = base;
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
        return base * getHeight() / 2;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: RightTriangle, area: " + getArea()
                + " sq.units, base: " + getBase()
                + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }
}
