package core.basesyntax;

import static java.lang.Math.PI;

public class Circle extends Figure {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String info() {
        return "Figure: circle, area: "
                + area()
                + " sq. units, radius: "
                + radius
                + " units, color: "
                + getColor();
    }

    @Override
    public double area() {
        return radius * radius * PI;
    }
}
