package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private double radius;

    private String circleColor = new Figure().getColor();

    public Circle(Random random) {
        this.radius = Math.abs(random.nextDouble());
        this.circleColor = ColorSupplier.getRandomColor();
        draw();
    }

    public Circle(int radius) {
        this.circleColor = Color.WHITE.name();
        this.radius = radius;
        draw();

    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, radius: "
                + radius + " units, color: " + circleColor);
    }
}
