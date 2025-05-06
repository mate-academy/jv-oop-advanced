package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.enums.FigureType;

public class Circle extends Figure {
    private static final double PI = 3.14;
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureType.CIRCLE.name() + ", area: "
                + area() + " sq. units"
                + ", radius: " + radius + " units, " + "color: " + getColor());
    }

    @Override
    public double area() {
        return PI * (radius * radius);
    }
}
