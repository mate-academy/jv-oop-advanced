package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    public static final int BOUND = 100;

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
        this.radius = random.nextInt(BOUND);
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
