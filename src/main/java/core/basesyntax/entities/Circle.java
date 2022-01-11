package core.basesyntax.entities;

import core.basesyntax.service.ColorSupplier;
import java.util.Random;

public class Circle extends Figure {
    private Integer radius;

    public Circle() {
    }

    public Circle(Random random) {
        this.random = random;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * (radius ^ COEFFICIENT_TWO);
    }

    @Override
    double getPerimeter() {
        return Math.PI * radius * COEFFICIENT_TWO;
    }

    @Override
    public String toString() {
        return "Figure: Circle, area: " + getArea() + " sq.units"
                + ", perimeter: " + getPerimeter()
                + ", radius: " + radius
                + ", color: " + color;
    }

    @Override
    public Figure setRandomProperties(ColorSupplier colorSupplier) {
        super.setRandomProperties(colorSupplier);
        this.radius = random.nextInt(BOUND);
        return this;
    }
}
