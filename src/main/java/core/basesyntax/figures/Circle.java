package core.basesyntax.figures;

import core.basesyntax.Figure;
import java.util.Random;

public class Circle extends Figure {
    private double radius;

    public Circle() {
        super();
        this.radius = Math.round(new Random().nextDouble(100) * 10.0) / 10.0;
    }

    public Circle(double radius) {
        super();
        this.radius = Math.round(radius * 10.0) / 10.0;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq. units, radius: " + radius
                + " units, color: " + getColor());
    }
}

