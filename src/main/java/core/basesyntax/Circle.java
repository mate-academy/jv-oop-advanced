package core.basesyntax;

import static java.lang.Math.PI;

public class Circle extends Figure {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String info() {
        double area = radius * radius * PI;
        return "Figure: circle, area: "
                + area
                + " sq. units, radius: "
                + radius
                + " units, color: "
                + getColor();
    }
}
