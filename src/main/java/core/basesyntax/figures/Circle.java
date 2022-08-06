package core.basesyntax.figures;

import java.util.Random;
import suppliers.ColorSupplier;

public class Circle extends Figure {
    private double radius;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        int exponent = 2;
        return Math.PI * Math.pow(radius, exponent);
    }

    @Override
    public String getInfo() {
        return "Figure: " + getFigureName() + ", "
                + "area: " + getArea() + " sq.units, radius: "
                + getRadius() + ", color: " + getColor();
    }

    public Circle setRandomCircle() {
        Circle circle = new Circle();
        circle.setFigureName("circle");
        circle.setRadius(random.nextDouble() + 1);
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }
}
