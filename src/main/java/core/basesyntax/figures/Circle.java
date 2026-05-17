package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.interfaces.AreaCalculator;

public class Circle extends Figure implements AreaCalculator {
    private double radius;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public void print() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase()
                + ", area: " + calculateArea()
                + " sq. units, radius: " + radius
                + " units, color: " + getColor());
    }
}
