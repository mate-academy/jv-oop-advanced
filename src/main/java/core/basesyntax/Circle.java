package core.basesyntax;

import java.util.Random;

public class Circle extends FigureDraw implements AreaCalculator {

    private Double radius;

    Circle() {
        radius = new Random().nextInt(10) * 1.00 + 1.00;
    }

    @Override
    public double getArea() {
        return Math.round(radius * radius * Math.PI);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: "
                + radius + " units, color: " + ColorSupplier.getRandomColor());
    }
}
