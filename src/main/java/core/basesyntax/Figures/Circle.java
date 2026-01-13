package core.basesyntax.Figures;

import core.basesyntax.Interfaces.Draweble;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {

        this.radius = radius;
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

    @Override
    public String drawing() {
        return "Figure: circle, area: "
                + this.getArea()
                + " sq. units, radius: "
                + radius
                + " units, color: "
                + super.getColor();
    }
}