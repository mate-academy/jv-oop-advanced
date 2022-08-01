package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void getDraw() {
        System.out.println("This is Circle. I have Area: " + getArea() + "; radius: "
                + radius + "; and have color: " + getColor());
    }
}
