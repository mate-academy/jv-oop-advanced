package core.basesyntax.figures;

import core.basesyntax.Figure;

import java.util.Random;

public class Circle extends Figure {
    private int radius;
    private Random random = new Random();

    @Override
    public void draw() {
        setFigureName("circle");
        System.out.println("Figure: " + getFigureName()
                + ", area: " + getArea()
                + " sq.units, radius: " + getRadius()
                + " units, color: " + getColor());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void setRandomProperties() {
        setRadius(random.nextInt(20));
    }
}
