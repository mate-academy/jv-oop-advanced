package core.basesyntax;

import static java.lang.Math.PI;

public class Circle extends Figure {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String draw() {
        return "Figure: circle, area: "
                + getArea()
                + " sq. units, radius: "
                + radius
                + " units, color: "
                + getColor();
    }

    @Override
    public double getArea() {
        return radius * radius * PI;
    }

    public Circle prepareCircle() {
        Circle circle = new Circle();
        circle.setRadius(side());
        circle.setColor(color());
        return circle;
    }
}
