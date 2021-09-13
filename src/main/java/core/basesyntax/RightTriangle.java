package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure implements AreaCalculator, FigureDraw {
    private int base;
    private int height;

    public RightTriangle() {
        this.setColor(new ColorSupplier().getRandomColor());
        this.base = new Random().nextInt(10) + 1;
        this.height = new Random().nextInt(10) + 1;
    }

    @Override
    public double getArea() {
        return (double) base * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: " + getArea() + " sq.units, base: " + base
                + " units, height: " + height + " units, color: " + getColor());
    }
}
