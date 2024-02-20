package core.basesyntax;

import static core.basesyntax.Shape.RIGHT_TRIANGLE;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    public RightTriangle(int base, int height, Color color) {
        super(color);
        this.base = base;
        this.height = height;;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public Shape getName() {
        return RIGHT_TRIANGLE;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public Color getColor() {
        return new ColorSupplier().getRandomColor();
    }

    @Override
    public void describe() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq, base: "
                + getBase() + " units, height: " + getHeight() + " units, color: " + getColor());
    }
}

