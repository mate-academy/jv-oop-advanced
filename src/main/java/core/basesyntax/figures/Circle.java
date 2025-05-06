package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.enums.FigureType;

public class Circle extends Figure {
    private static final double PI = 3.14;
    private final double radius;
    private final String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureType.CIRCLE.name() + ", area: "
                + area() + " sq. units"
                    + ", radius: " + radius + " units, " + "color: " + color);
    }

    @Override
    public double area() {
        return PI * (radius * radius);
    }
}
