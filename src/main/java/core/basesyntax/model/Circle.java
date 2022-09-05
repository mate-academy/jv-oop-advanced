package core.basesyntax.model;

import java.util.Random;

public class Circle extends Figure {
    private int radius;

    public Circle() {}

    public Circle(int radius, String Color) {
        this.radius = radius;
        super.setColor(Color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void setRandomParameters() {
        super.setRandomParameters();
        this.radius = new Random().nextInt(100);
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + getArea() + " sq.units, radius = " + radius + " units, colour: " + getColor();
    }
}
