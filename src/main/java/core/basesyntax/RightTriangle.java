package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {

    private int base;
    private int height;

    private ColorSupplier colorSupplier = new ColorSupplier();

    public RightTriangle(int base, int height, String color) {
        this.height = height;
        this.base = base;
        setColor(color);
    }

    public RightTriangle() {
    }

    public RightTriangle getRandomRightTriangle() {
        String color = colorSupplier.getColorOfFigure();
        int base = new Random().nextInt(10);
        int height = new Random().nextInt(10);
        return new RightTriangle(base, height, color);
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println(("Figure: right triangle, height: " + height + ", base: "
                + base + ", area: " + getArea() + ", color: " + getColor()));

    }
}
