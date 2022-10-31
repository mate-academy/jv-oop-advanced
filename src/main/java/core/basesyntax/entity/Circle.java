package core.basesyntax.entity;

import core.basesyntax.Colors;
import core.basesyntax.Figure;
import java.util.Random;

public class Circle extends Figure {
    private int radius;

    public Circle() {
        this.radius = new Random().nextInt(MAX_VALUE);
    }

    public Circle(int radius, Colors color) {
        this.radius = radius;
        super.color = color.toString();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String drawFigure() {
        return "Figure: circle, area: " + getArea() + " sq.units, radius: "
                + radius + " units, color: " + color;
    }
}

