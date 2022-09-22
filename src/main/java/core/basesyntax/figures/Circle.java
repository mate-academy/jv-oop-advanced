package core.basesyntax.figures;

import core.basesyntax.Figure;
import java.util.Random;

public class Circle extends Figure {
    private int radius;

    public Circle() {
    }

    public Circle(String color, int radius) {
        super.setColor(color);
        this.radius = radius;
    }

    @Override
    public void setRandomProperties() {
        super.setRandomProperties();
        this.radius = new Random().nextInt(100);
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + getArea()
                + " sq.units, radius: " + radius
                + " units, color: " + getColor();
    }
}
