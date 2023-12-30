package core.basesyntax.figures;

import java.util.Random;

public class Circle extends Figure {
    private static final int MAX_SIZE_VALUE = 101;
    private int radius;
    private Random random = new Random();

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void drawTheFigure() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq. units, radius: " + radius + " units, color: " + color.toLowerCase());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}


