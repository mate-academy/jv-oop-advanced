package core.basesyntax.figures;

import core.basesyntax.Colors;
import core.basesyntax.Figure;
import core.basesyntax.FigureArea;

public class Circle extends Figure implements FigureArea {
    private int radius;

    public Circle(Colors color, int radius) {
        super(color);
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
        return Math.PI * (radius * radius);
    }

    @Override
    public void messageInfo() {
        System.out.println("Figure: circle, area: " + Math.rint(getArea())
                + " sq.units, radius: " + radius + " units, color: " + getColor());
    }
}
