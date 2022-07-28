package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.ColorSupplier;
import core.basesyntax.Figure;
import java.util.Random;

public class Circle extends Figure {
    private int radius;

    public Circle() {
    }

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void printArea() {
        System.out.println(Math.PI * radius * radius);
    }

    @Override
    public Circle getRandomParameters() {
        Random random = new Random();
        int max = Figure.MAX_VALUE_OF_PARAM;
        Color circleColor = new ColorSupplier().getRandomColor();
        return new Circle(circleColor, random.nextInt(max));
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + getArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor();
    }
}
