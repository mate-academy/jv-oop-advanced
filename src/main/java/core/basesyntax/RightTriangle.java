package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {

    private int base;
    private int height;

    public RightTriangle(int base, int height, String color) {
        this.height = height;
        this.base = base;
        setColor(color);
    }

    public RightTriangle() {
    }

    public RightTriangle getRandomRightTriangle() {
        String color = getColor();
        int base = new Random().nextInt(10);
        int height = new Random().nextInt(10);
        return new RightTriangle(base, height, color);
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println(("Figure: right triangle, height: " + height + ", base: "
                + base + ", area: " + getArea() + ", color: " + getColor()));

    }
}
