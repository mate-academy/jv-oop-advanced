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
    public String getName() {
        return getClass().getSimpleName();
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void describe() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq, base: "
                + getBase() + " units, height: " + getHeight() + " units, color: " + getColor());
    }
}
