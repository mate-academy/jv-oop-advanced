package core.basesyntax.model.extended;

import core.basesyntax.model.Figure;
import core.basesyntax.utils.Color;

public class Circle extends Figure {
    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.sqrt(radius);
    }

    @Override
    public void draw() {
        double area = calcArea();
        String colorString = color.toString();

        System.out.printf("Figure: circle, area: %,.2f sq.units, radius: %d units, color: %s%n",
                 area, radius, colorString);
    }
}
