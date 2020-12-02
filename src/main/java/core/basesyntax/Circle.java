package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private int radius;

    public Circle() {
        this.radius = new Random().nextInt(10);
        setColor();
        toString();
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * radius * radius);
    }

    public double getCircuit() {
        return Math.round(2 * Math.PI * radius);
    }

    @Override
    public String toString() {

        return super.toString() + " circle, "
                + " area: " + getArea()
                + " color: " + getColor()
                + " radius: " + getRadius()
                + " circuit: " + getCircuit();
    }
}
