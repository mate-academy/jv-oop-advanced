package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    public RightTriangle() {
        this.base = new Random().nextInt(15);
        this.height = new Random().nextInt(15);
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
