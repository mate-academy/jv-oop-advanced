package core.basesyntax;

import java.awt.Color;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, Color color, FigureTypes name) {
        this.radius = radius;
        super.setName(name);
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        String circleInfo = "Figure: "
                + FigureTypes.CIRCLE
                + ", area: "
                + getArea()
                + " sq.units, radius: "
                + radius
                + " units, color: "
                + getColor();
        System.out.println(circleInfo);
    }
}
