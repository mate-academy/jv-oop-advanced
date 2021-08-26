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
        StringBuilder circleStringBuilder = new StringBuilder();
        circleStringBuilder
                .append("Figure: ")
                .append(FigureTypes.CIRCLE)
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, radius: ")
                .append(radius)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(circleStringBuilder);
    }
}
